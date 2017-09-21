/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Oracle and Java are registered trademarks of Oracle and/or its affiliates.
 * Other names may be trademarks of their respective owners.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common
 * Development and Distribution License("CDDL") (collectively, the
 * "License"). You may not use this file except in compliance with the
 * License. You can obtain a copy of the License at
 * http://www.netbeans.org/cddl-gplv2.html
 * or nbbuild/licenses/CDDL-GPL-2-CP. See the License for the
 * specific language governing permissions and limitations under the
 * License.  When distributing the software, include this License Header
 * Notice in each file and include the License file at
 * nbbuild/licenses/CDDL-GPL-2-CP.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the GPL Version 2 section of the License file that
 * accompanied this code. If applicable, add the following below the
 * License Header, with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * If you wish your version of this file to be governed by only the CDDL
 * or only the GPL Version 2, indicate your decision by adding
 * "[Contributor] elects to include this software in this distribution
 * under the [CDDL or GPL Version 2] license." If you do not indicate a
 * single choice of license, a recipient has the option to distribute
 * your version of this file under either the CDDL, the GPL Version 2 or
 * to extend the choice of license to its licensees as provided above.
 * However, if you add GPL Version 2 code and therefore, elected the GPL
 * Version 2 license, then the option applies only if the new code is
 * made subject to such option by the copyright holder.
 *
 * Contributor(s):
 *
 * Portions Copyrighted 2008 Sun Microsystems, Inc.
 */

package org.netbeans.modules.maven.nodes;

import java.io.File;
import java.util.Collections;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileFilter;
import org.apache.maven.artifact.Artifact;
import org.netbeans.modules.maven.NbMavenProjectImpl;
import org.netbeans.modules.maven.api.execute.RunUtils;
import org.netbeans.modules.maven.execute.BeanRunConfig;
import static org.netbeans.modules.maven.nodes.Bundle.*;
import org.netbeans.modules.maven.options.MavenCommandSettings;
import org.openide.DialogDescriptor;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.util.HelpCtx;
import org.openide.util.NbBundle.Messages;


/**
 *
 * @author  mkleint
 */
public class InstallPanel extends javax.swing.JPanel {

    private static File lastFolder = new File(System.getProperty("user.home")); //NOI18N
    
    /** Creates new form InstallPanel */
    private InstallPanel() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFile = new javax.swing.JLabel();
        txtFile = new javax.swing.JTextField();
        btnFile = new javax.swing.JButton();
        lblHint = new javax.swing.JLabel();

        lblFile.setLabelFor(txtFile);
        org.openide.awt.Mnemonics.setLocalizedText(lblFile, org.openide.util.NbBundle.getMessage(InstallPanel.class, "InstallPanel.lblFile.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(btnFile, org.openide.util.NbBundle.getMessage(InstallPanel.class, "InstallPanel.btnFile.text")); // NOI18N
        btnFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFileActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(lblHint, org.openide.util.NbBundle.getMessage(InstallPanel.class, "InstallPanel.lblHint.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFile, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFile))
                    .addComponent(lblHint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFile)
                    .addComponent(btnFile)
                    .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        txtFile.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(InstallPanel.class, "InstallPanel.txtFile.accessiblename")); // NOI18N
        txtFile.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(InstallPanel.class, "InstallPanel.txtFile.accessibledesc")); // NOI18N
        btnFile.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(InstallPanel.class, "InstallPanel.btnFile.accessibledesc")); // NOI18N

        getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(InstallPanel.class, "InstallPanel.panel.accessibledesc")); // NOI18N
    }// </editor-fold>//GEN-END:initComponents

    private void btnFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFileActionPerformed
// TODO add your handling code here:
        JFileChooser chooser = new JFileChooser(lastFolder);
        chooser.setDialogTitle(org.openide.util.NbBundle.getMessage(InstallPanel.class, "TIT_Select_Artifact"));
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return (f.isDirectory() || f.getName().toLowerCase().endsWith(".jar"));//NOI18N
            }
            @Override
            public String getDescription() {
                return org.openide.util.NbBundle.getMessage(InstallPanel.class, "SEL_Jars");
            }
        });
        chooser.setMultiSelectionEnabled(false);
        if (txtFile.getText().trim().length() > 0) {
            File fil = new File(txtFile.getText().trim());
            if (fil.exists()) {
                chooser.setSelectedFile(fil);
            }
        }
        int ret = chooser.showDialog(SwingUtilities.getWindowAncestor(this), org.openide.util.NbBundle.getMessage(InstallPanel.class, "TIT_Select"));
        if (ret == JFileChooser.APPROVE_OPTION) {
            txtFile.setText(chooser.getSelectedFile().getAbsolutePath());
            txtFile.requestFocusInWindow();
        }

    }//GEN-LAST:event_btnFileActionPerformed

    File getFile() {
        File fil = txtFile.getText().trim().length() > 0 ? new File(txtFile.getText().trim()) : null;
        return fil != null && fil.exists() ? fil : null;
    }
    
    @Messages({
        "# {0} - groupId",
        "# {1} - artifactId",
        "# {2} - version",
        "# {3} - classifier",
        "MSG_Instructions=<html>Please enter path to JAR file that represents the dependency with <br>groupId: <b>{0}</b>,<br>artifactId: <b>{1}</b>,<br>version: <b>{2}</b>{3}<br>This JAR will be copied to your local repository. <br>Please note that having non-repository based JARs as dependencies is bad for build reproducibility.</html>", 
        "BTN_Install_locally=Install locally", "TIT_Install_locally=Install locally"})
    public static File showInstallDialog(Artifact art) {
        final InstallPanel panel = new InstallPanel();
        panel.setExplainText(MSG_Instructions(art.getGroupId(), art.getArtifactId(), art.getVersion(), art.getClassifier() != null ? ",<br>classifier: <b>" + art.getClassifier() + "</b>" : "."));
                
                
        final JButton btnSelect  = new JButton(BTN_Install_locally());
        btnSelect.setEnabled(panel.getFile() != null);
        panel.addDocListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {
                btnSelect.setEnabled(panel.getFile() != null);
            }
            @Override
            public void insertUpdate(DocumentEvent e) {
                btnSelect.setEnabled(panel.getFile() != null);
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                btnSelect.setEnabled(panel.getFile() != null);
            }
        });
        Object[] options =  new Object[] {
            btnSelect,
            NotifyDescriptor.CANCEL_OPTION
        };
        DialogDescriptor dd = new DialogDescriptor(panel, TIT_Install_locally(),
                true,
                options,
                btnSelect, 0, HelpCtx.DEFAULT_HELP, null);
        dd.setClosingOptions(options);
        Object ret = DialogDisplayer.getDefault().notify(dd);
        if (ret == btnSelect) {
            lastFolder = panel.getFile().getParentFile();
            return panel.getFile();
        }
        return null;
    }
    
    @Messages("TXT_InstallTask=Install artifact")
    public static void runInstallGoal(NbMavenProjectImpl project, File fil, Artifact art) {
        BeanRunConfig brc = new BeanRunConfig();
        brc.setExecutionDirectory(project.getPOMFile().getParentFile());
        brc.setProject(project);
        brc.setGoals(Collections.singletonList(MavenCommandSettings.getDefault().getCommand(MavenCommandSettings.COMMAND_INSTALL_FILE))); //NOI18N
        brc.setExecutionName("install-artifact"); //NOI18N
        brc.setProperty("artifactId", art.getArtifactId()); //NOI18N
        brc.setProperty("groupId", art.getGroupId()); //NOI18N
        brc.setProperty("version", art.getVersion()); //NOI18N
        brc.setProperty("packaging", art.getType()); //NOI18N
        if (art.getClassifier() != null) {
            brc.setProperty("classifier", art.getClassifier()); //NOI18N
        }
        brc.setProperty("file", fil.getAbsolutePath()); //NOI18N
        brc.setProperty("generatePom", "false"); //NOI18N
        brc.setActivatedProfiles(Collections.<String>emptyList());
        brc.setTaskDisplayName(TXT_InstallTask());
        RunUtils.executeMaven(brc); //NOI18N
        //TODO how to handle errors
        
    }

    private void addDocListener(DocumentListener documentListener) {
        txtFile.getDocument().addDocumentListener(documentListener);
    }

    private void setExplainText(String string) {
        lblHint.setText(string);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFile;
    private javax.swing.JLabel lblFile;
    private javax.swing.JLabel lblHint;
    private javax.swing.JTextField txtFile;
    // End of variables declaration//GEN-END:variables
    
}