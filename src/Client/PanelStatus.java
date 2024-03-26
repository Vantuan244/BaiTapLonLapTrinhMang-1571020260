package Client;

import Client.utils.gui;
import Model.Role;
import config.Constaint;
import java.util.List;
import javax.swing.JLabel;

/**
 *
 * @author cr4zyb0t
 */
public class PanelStatus extends javax.swing.JPanel {
    private class RoleUI{
        public JLabel roleIcon, roleQuantity;

        public RoleUI(JLabel roleIcon, JLabel roleQuantity) {
            this.roleIcon = roleIcon;
            this.roleQuantity = roleQuantity;
        }
        
        public void set(Role conf, boolean random){
            this.roleIcon.setIcon(gui.resizeImage(Constaint.pathRoot + "/assets/icon_role/icon_role" + conf.idRole + ".png", 36, 36));
            if(!random)
                this.roleQuantity.setText(conf.quantity + "");
            else
                this.roleQuantity.setText("?");
        }
        
    }
    
    public PanelStatus(List<Role> configs, boolean isRandom) {
        initComponents();
        JLabel [] roleIcon = new JLabel[]{role0, role1, role2, role3, role4, r5,r6,r7,r8,r9};
        JLabel [] quantityIcon = new JLabel[]{c0, count1, count2, count3, count4, c5,c6,c7,c8,c9};
        RoleUI[] uix = new RoleUI[10];
        for(int i = 0 ; i < 10; i++)
            uix[i] =  new RoleUI(roleIcon[i], quantityIcon[i]);
        int idx = 0;
        for(Role r: configs){
            uix[idx++].set(r, isRandom);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        role0 = new javax.swing.JLabel();
        c0 = new javax.swing.JLabel();
        role1 = new javax.swing.JLabel();
        count1 = new javax.swing.JLabel();
        role2 = new javax.swing.JLabel();
        count2 = new javax.swing.JLabel();
        role3 = new javax.swing.JLabel();
        count3 = new javax.swing.JLabel();
        role4 = new javax.swing.JLabel();
        count4 = new javax.swing.JLabel();
        c7 = new javax.swing.JLabel();
        r8 = new javax.swing.JLabel();
        c8 = new javax.swing.JLabel();
        r9 = new javax.swing.JLabel();
        c9 = new javax.swing.JLabel();
        c5 = new javax.swing.JLabel();
        r5 = new javax.swing.JLabel();
        r6 = new javax.swing.JLabel();
        c6 = new javax.swing.JLabel();
        r7 = new javax.swing.JLabel();

        role0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon_role/icon_role0.png"))); // NOI18N

        c0.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        c0.setText("1");

        role1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon_role/icon_role0.png"))); // NOI18N

        count1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        count1.setText("1");

        role2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon_role/icon_role0.png"))); // NOI18N

        count2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        count2.setText("1");

        role3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon_role/icon_role0.png"))); // NOI18N

        count3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        count3.setText("1");

        role4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon_role/icon_role0.png"))); // NOI18N

        count4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        count4.setText("1");

        c7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        c7.setText("1");

        r8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon_role/icon_role0.png"))); // NOI18N

        c8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        c8.setText("1");

        r9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon_role/icon_role0.png"))); // NOI18N

        c9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        c9.setText("1");

        c5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        c5.setText("1");

        r5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon_role/icon_role0.png"))); // NOI18N

        r6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon_role/icon_role0.png"))); // NOI18N

        c6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        c6.setText("1");

        r7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon_role/icon_role0.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(r5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(role0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c0, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(role1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(count1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(role2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(count2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(role3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(count3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(role4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(count4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(role4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(count4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(role3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(count3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(role2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(count2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(role1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(count1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(role0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel c0;
    private javax.swing.JLabel c5;
    private javax.swing.JLabel c6;
    private javax.swing.JLabel c7;
    private javax.swing.JLabel c8;
    private javax.swing.JLabel c9;
    private javax.swing.JLabel count1;
    private javax.swing.JLabel count2;
    private javax.swing.JLabel count3;
    private javax.swing.JLabel count4;
    private javax.swing.JLabel r5;
    private javax.swing.JLabel r6;
    private javax.swing.JLabel r7;
    private javax.swing.JLabel r8;
    private javax.swing.JLabel r9;
    private javax.swing.JLabel role0;
    private javax.swing.JLabel role1;
    private javax.swing.JLabel role2;
    private javax.swing.JLabel role3;
    private javax.swing.JLabel role4;
    // End of variables declaration//GEN-END:variables
}