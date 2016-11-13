
import java.util.ArrayList;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;


public class MiniTwitterUI extends javax.swing.JFrame implements TreeComposite{
    private final UserGroup root;
    private User currentUser;
    private UserGroup currentGroup;
    private ArrayList<UserUIView> viewers;
    private ArrayList<DefaultMutableTreeNode> users;
    private ArrayList<String> groups;
    private DefaultMutableTreeNode roott;
    private DefaultMutableTreeNode current;
    private DefaultTreeModel model;
    private TreeComposite message;
    private CounterVisitor UGcounter;
    
    //opens the twitter UI
    public MiniTwitterUI() {
        //going to hold all the users
        users = new ArrayList<DefaultMutableTreeNode>();
        //going to hold all the groups
        groups = new ArrayList<String>();
        //the root usergroup
        root = new UserGroup("Root");
        //initialize the CounterVisitor
        UGcounter = new CounterVisitor();
        //insert the user group into the tree
        roott = new DefaultMutableTreeNode(root,true);
        //count the root group
        UGcounter.groupcount();
        //make the current selected node the root
        current = roott;
        //the current group is also the root group
        currentGroup = root;
        //initialize the UserUIView which is going to hold all the userUI
        viewers = new ArrayList<UserUIView>();
    }
    
    @Override
    //load the UI
    public void display() {
        setVisible(true);
        initComponents();
    }
    
    //check if that user already exists
    private boolean checkUsers(String name) {
        for(int i = 0; i < users.size(); i++) {
            if(name.equals(users.get(i).getUserObject().toString())) {
                return false;
            }
            else {
                
            }
        }
        return true;
    }
    
    //check if that group already exists
    private boolean checkGroups(String name) {
        for(int i = 0; i < groups.size(); i++) {
            if(name.equals(groups.get(i))) {
                return false;
            }
        }
        return true;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree(roott);
        AddUser = new javax.swing.JButton();
        AddGroup = new javax.swing.JButton();
        OpenUser = new javax.swing.JButton();
        PositivePercent = new javax.swing.JButton();
        GroupTotal = new javax.swing.JButton();
        UserTotal = new javax.swing.JButton();
        MessageTotal = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        GroupID = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        UserID = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Control Panel");

        jTree1.setCellRenderer(new MyTreeCell());
        jTree1.addTreeSelectionListener(new TreeSelectionListener() {
            public void valueChanged(TreeSelectionEvent e) {
                DefaultMutableTreeNode node = (DefaultMutableTreeNode)jTree1.getLastSelectedPathComponent();
                if(node == null) {
                    return;
                }
                if(node.getUserObject() instanceof User) {
                    currentUser = (User)node.getUserObject();
                    current = (DefaultMutableTreeNode)node.getParent();
                }
                else {
                    currentUser = null;
                    current = node;
                }
            }
        });
        jScrollPane1.setViewportView(jTree1);

        AddUser.setText("Add User");
        AddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUserActionPerformed(evt);
            }
        });

        AddGroup.setText("Add Group");
        AddGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddGroupActionPerformed(evt);
            }
        });

        OpenUser.setText("Open User View");
        OpenUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenUserActionPerformed(evt);
            }
        });

        PositivePercent.setText("Show Positive Percentage");
        PositivePercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PositivePercentActionPerformed(evt);
            }
        });

        GroupTotal.setText("Show Group Total");
        GroupTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GroupTotalActionPerformed(evt);
            }
        });

        UserTotal.setText("Show User Total");
        UserTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserTotalActionPerformed(evt);
            }
        });

        MessageTotal.setText("Show Messages Total");
        MessageTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MessageTotalActionPerformed(evt);
            }
        });

        GroupID.setColumns(20);
        GroupID.setRows(5);
        jScrollPane4.setViewportView(GroupID);

        UserID.setColumns(20);
        UserID.setRows(5);
        jScrollPane5.setViewportView(UserID);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UserTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MessageTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(GroupTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PositivePercent, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AddUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AddGroup, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OpenUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AddUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4)
                            .addComponent(AddGroup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(OpenUser, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GroupTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PositivePercent, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MessageTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Open the UserUI
    private void OpenUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenUserActionPerformed
        //check if the user is selected on the tree
        if(currentUser == null) {
            message = new DisplayMessage("User is not selected");
            message.display();
        }
        //open the userUI using the selected user
        else {
            TreeComposite UI = new UserUIView(currentUser, users, viewers);
            viewers.add((UserUIView)UI);
            UI.display();
        }
    }//GEN-LAST:event_OpenUserActionPerformed

    //adds a user
    private void AddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUserActionPerformed
       
        String name = UserID.getText();
        
        //check if user already exists
        if(!checkUsers(name)) {
            message = new DisplayMessage("User already exists!!!");
            message.display();
        }
        
        //make sure no empty spaces else add the user
        if(checkUsers(name) && !"".equals(name)){
            User temp = new User(name);
            DefaultMutableTreeNode usernode = new DefaultMutableTreeNode(temp,false);
            users.add(usernode);
            currentGroup.add(temp);
            model = (DefaultTreeModel) jTree1.getModel();
            current.add(usernode);
            model.reload();
            UGcounter.usercount();
        }
        UserID.setText("");
    }//GEN-LAST:event_AddUserActionPerformed
    
    //add group
    private void AddGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddGroupActionPerformed
        String name = GroupID.getText();
        
        //check if the group already exists
        if(!checkGroups(name)) {
            message = new DisplayMessage("UserGroup already exists!!!");
            message.display();
        }
        
        //if it doesn't add it to the user group also the group name can not be empty spaces
        if(checkGroups(name) && !"".equals(name)) {
            groups.add(name);
            UserGroup temp = new UserGroup(name);
            
            model = (DefaultTreeModel) jTree1.getModel();
            current.add(new DefaultMutableTreeNode(new UserGroup(name),true));
            model.reload(); 
            UGcounter.groupcount();
       }
        GroupID.setText("");
    }//GEN-LAST:event_AddGroupActionPerformed
    
    //print total number of tweets
    private void MessageTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MessageTotalActionPerformed
        int tweetz = 0;
        for(UserUIView users: viewers) {
            tweetz += users.returnVisits().returnCounter(0);
        }
        message = new DisplayMessage("There are total of " + tweetz + " unique tweets!!!");
        message.display();
    }//GEN-LAST:event_MessageTotalActionPerformed
    
    //print total users
    private void UserTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserTotalActionPerformed
        int users = UGcounter.returnCounter(0);
        message = new DisplayMessage("There are total of " + users + " users!!!");
        message.display();
    }//GEN-LAST:event_UserTotalActionPerformed
    
    //print total groups
    private void GroupTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GroupTotalActionPerformed
        int groups = UGcounter.returnCounter(1);
        message = new DisplayMessage("There are total of " + groups + " groups!!!");
        message.display();
    }//GEN-LAST:event_GroupTotalActionPerformed

    //print positive percentage
    private void PositivePercentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PositivePercentActionPerformed
        int posi = 0;
        int tweet = 0;
        for(UserUIView users: viewers) {
            tweet += users.returnVisits().returnCounter(0);
            posi += users.returnVisits().returnCounter(1);
        }
        double percent = ((double)posi/(double)tweet) * 100;
        message = new DisplayMessage("The percent positive tweets: " + percent + "%");
        message.display();
        
    }//GEN-LAST:event_PositivePercentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddGroup;
    private javax.swing.JButton AddUser;
    private javax.swing.JTextArea GroupID;
    private javax.swing.JButton GroupTotal;
    private javax.swing.JButton MessageTotal;
    private javax.swing.JButton OpenUser;
    private javax.swing.JButton PositivePercent;
    private javax.swing.JTextArea UserID;
    private javax.swing.JButton UserTotal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
