package Server.service;

import Model.Game;
import Model.Role;
import Model.Player;
import Model.PlayerEffect;
import Model.Room;
import Utils.RandomUtils;
import Utils.StringUtils;
import config.Constaint;
import java.util.ArrayList;
import java.util.List;
import payload.Message;

/**
 *
 * @author cr4zyb0t
 */
public class RoleService implements TemplateService{
    private final static RoleService roleService = new RoleService();
    private final String nameService = "RoleService";

    /**
     *
     * @return
     */
    public static RoleService gI(){
        return roleService;
    }
    
    /**
     *
     */
    public List<Role> roles = new ArrayList<>();
    
    /**
     *
     */
    @Override
    public void init(){
        roles.add(new Role(
                Constaint.ROLE_DANLANG, 
                "Dân làng", 
                "Thuộc phe dân làng, dân làng không có kỹ năng đặc biệt gì, chỉ ăn với ngủ",
                Constaint.TEAM_VILLAGE,
                1, 
                8));
        roles.add(new Role(
                Constaint.ROLE_THAYBOI, 
                "Thầy bói", 
                "Thuộc phe dân làng, có thể kiểm tra người đó có phải là sói hoặc dân làng",
                Constaint.TEAM_VILLAGE,
                0, 
                2));
        roles.add(new Role(
                Constaint.ROLE_BACSI, 
                "Bác sĩ", 
                "Thuộc phe dân làng, bạn có thể chọn bảo vệ 1 người vào ban đêm, ban đêm người đó sẽ không thể bị giết bởi ma sói",
                Constaint.TEAM_VILLAGE,
                0, 
                1));
        roles.add(new Role(
                Constaint.ROLE_BANSOI, 
                "Bán sói", 
                "Thuộc phe dân làng, nhưng bị cắn sẽ thành sói thay vì chết và về phe sói",
                Constaint.TEAM_VILLAGE,
                0, 
                1));
        roles.add(new Role(
                Constaint.ROLE_THANGNGO, 
                "Thằng ngố", 
                "Thuộc phe thứ 3, thắng khi bị làng treo cổ",
                Constaint.TEAM_THIRD,
                0, 
                1));
        roles.add(new Role(
                Constaint.ROLE_XATHU, 
                "Xạ thủ", 
                "Thuộc phe dân làng, có 2 viên đạn bắn trong ban ngày, lộ vị trí sau phát đầu tiên",
                Constaint.TEAM_VILLAGE,
                0, 
                1));
        roles.add(new Role(
                Constaint.ROLE_THAYDONG, 
                "Thầy đồng", 
                "Thuộc phe dân làng, có thể hồi sinh người chơi khác 1 lần và trò chuyện với người chết",
                Constaint.TEAM_VILLAGE,
                0, 
                1));
        roles.add(new Role(
                Constaint.ROLE_TIENTRI, 
                "Tiên tri", 
                "Thuộc phe dân làng, mỗi đêm có thể xem vai trò người khác 1 lần",
                Constaint.TEAM_VILLAGE,
                0, 
                1));
        roles.add(new Role(
                Constaint.ROLE_SOI, 
                "Sói", 
                "Thuộc phe sói, ban đêm chuyên đi cắn người",
                Constaint.TEAM_WOLF,
                1, 
                2));
        roles.add(new Role(
                Constaint.ROLE_SOITIENTRI, 
                "Sói tiên tri", 
                "Thuộc phe sói,có khả năng tiên tri và ban đêm chuyên đi cắn người",
                Constaint.TEAM_WOLF,
                0, 
                1));
        ManagerService.initSuccess(nameService);
    }
    
    /**
     *
     * @param p
     * @param role
     */
    public void setPropertyRole(Player p, int role){
        p.playerEffect = new PlayerEffect();
        p.playerEffect.idRole = (byte)role;
        switch(role){
            case Constaint.ROLE_SOITIENTRI:{
                p.playerEffect.isSoiTienTri = true;
                break;
            }
            case Constaint.ROLE_SOI:{
                p.playerEffect.isSoi = true;
                break;
            }
            case Constaint.ROLE_TIENTRI:{
                p.playerEffect.isTienTri = true;
                break;
            }
            case Constaint.ROLE_THAYDONG:{
                p.playerEffect.isThayDong = true;
                p.playerEffect.revivalTime = 1;
                break;
            }
            case Constaint.ROLE_BACSI:{
                p.playerEffect.isBacSi = true;
                break;
            }
            case Constaint.ROLE_THAYBOI:{
                p.playerEffect.isThayBoi = true;
                break;
            }
            case Constaint.ROLE_DANLANG:{
                p.playerEffect.isDanLang = true;
                break;
            }
            case Constaint.ROLE_BANSOI:{
                p.playerEffect.isBanSoi = true;
                break;
            }
            case Constaint.ROLE_THANGNGO:{
                p.playerEffect.isChuaHe = true;
                break;
            }
            case Constaint.ROLE_XATHU:{
                p.playerEffect.isXaThu = true;
                p.playerEffect.bullet = 2;
                break;
            }
        }
    }
    
    /**
     *
     * @param id
     * @return
     */
    public Role getRoleConfigById(byte id){
        for(var r: roles){
            if(r.idRole == id) return r;
        }
        return null;
    }
    
    /**
     *
     * @param arr
     * @param game
     */
    public void sendRoleToPlayer(List<Integer> arr, Game game){
        //Fake roll
//        int role2 = Constaint.ROLE_THAYDONG;
//        int role = Constaint.ROLE_SOI;
//        for(var p : game.players){
//            if(p.namePlayer.equals("admin")){
//                arr.remove((Integer)role);
//                RoleService.gI().setPropertyRole(p, role);
//                System.out.println("[Role] " + p.namePlayer + " " + StringUtils.getRoleNameById((byte)role));
//                MessageService.gI().sendMessagePrivate(p, 
//                        new Message(Constaint.MESSAGE_PICK_ROLE,role));
//            }
//            else if(p.namePlayer.length() > 5){
//                arr.remove((Integer)role2);
//                RoleService.gI().setPropertyRole(p, role2);
//                System.out.println("[Role] " + p.namePlayer + " " + StringUtils.getRoleNameById((byte)role2));
//                MessageService.gI().sendMessagePrivate(p, 
//                        new Message(Constaint.MESSAGE_PICK_ROLE,role2));
//            }
//            else{
//                int idRole = RandomUtils.getRandom(arr);
//                arr.remove((Integer)idRole);
//                RoleService.gI().setPropertyRole(p, idRole);
//                MessageService.gI().sendMessagePrivate(p, 
//                        new Message(Constaint.MESSAGE_PICK_ROLE,role));
//                System.out.println("[Role] " + p.namePlayer + " " + StringUtils.getRoleNameById((byte)idRole));
//            }
//        }
        
        //Real
        for(Player p: game.players){
            int idRole = RandomUtils.getRandom(arr);
            arr.remove((Integer)idRole);
            RoleService.gI().setPropertyRole(p, idRole);
            //System.out.println("[Role] " + p.namePlayer + " " + StringUtils.getRoleNameById((byte)idRole));
            MessageService.gI().sendMessagePrivate(p, 
                    new Message(Constaint.MESSAGE_PICK_ROLE,idRole));
        }
        
        game.players.forEach(p -> {
            p.game = game;
            if(p.playerEffect.isWolfTeam()){
                game.teamWolf.add(p);
            }
        });
    }
    
    
    /**
     *
     * @param room
     * @param game
     */
    public void rollByRandom(Room room, Game game){
        List<Integer> arr = new ArrayList<>();
        //Mặc định 100% có 1 tiên tri, 1 bác sĩ sói tiên tri và 2 sói thường, 
        //Có 50% có cơ hội thêm 1 con sói
        int count = 5;
        //100% dân làng
        arr.add((int)Constaint.ROLE_TIENTRI);
        arr.add((int)Constaint.ROLE_BACSI);
        //100% sói
        arr.add((int)Constaint.ROLE_SOITIENTRI);
        arr.add((int)Constaint.ROLE_SOI);
        //Trúng thưởng thêm sói
        boolean hasExtraWolf = RandomUtils.isTrue(50, 100);
        if(hasExtraWolf){
            arr.add((int)Constaint.ROLE_SOI);
            count = 4;
        }
        // 0 - 7: các role dân làng
        List<Integer> rolesVillage = new ArrayList<>(){};
        for(int i = 0; i < 8 ; i ++){//Lấy ra tất cả các role có thể roll
            if(i != Constaint.ROLE_TIENTRI && i != Constaint.ROLE_BACSI){
                rolesVillage.add(i);
            }
        }
        //Random các role còn lại
        while(count > 0){
            int idRole = RandomUtils.getRandom(rolesVillage);
            int quantity = Math.min(Math.max(getRoleConfigById((byte)idRole).requiredMin, 1), count);
            count -= quantity;
            for(int i = 0 ; i < quantity ; i++){
                arr.add(idRole);
            }
            rolesVillage.remove((Integer)idRole);
        }
        sendRoleToPlayer(arr, game);
    }
    
    /**
     *
     * @param room
     * @param game
     */
    public void rollByConfig(Room room, Game game){
        List<Integer> arr = new ArrayList<>();
        for(Role role : room.configs){
            for(int i = 0; i < role.quantity; i++){
                arr.add(role.idRole);
            }
        }
        sendRoleToPlayer(arr, game);
    }
    
    /**
     *
     * @param room
     * @param game
     */
    public void rollRoles(Room room, Game game){
        if(room.isRandom){
            rollByRandom(room, game);
        }
        else{
            rollByConfig(room, game);
        }
    }
    
    /**
     *
     */
    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     *
     */
    @Override
    public void stop() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     *
     * @return
     */
    @Override
    public String getServiceName() {
        return nameService;
    }
}
