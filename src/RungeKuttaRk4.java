
import static com.sun.javafx.tk.Toolkit.getToolkit;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import static java.lang.String.format;
import java.text.MessageFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import org.math.plot.Plot2DPanel;




/**
 *
 * @author Fader Azevedo Macuvele
 */
public class RungeKuttaRk4 extends JFrame {

    private DefaultTableModel model = new DefaultTableModel();
    private String orderm;
    private String[] colunasOrdem1 = {"i", "Xi", "Yi", "F", "Yi+1"};
    private String[] colunasOrdem2 = {"i", "Xi", "Yi", "F", "Yi+1"};
    private String[] colunasOrdem3 = {"i", "Xi", "Yi", "K1", "K2", "K3", "Yi+1"};
    private String[] colunasOrdem4 = {"i", "Xi", "Yi", "K1", "K2", "K3", "K4", "Yi+1"};

    private Plot2DPanel grafico = new Plot2DPanel();

    public RungeKuttaRk4() {
        initComponents();
        memoria = "funcao";
        this.model.setColumnIdentifiers(colunasOrdem1);
        this.tabela.setModel(model);
        orderm = "1ª Ordem";
//        this.setExtendedState(MAXIMIZED_BOTH);
        this.tabela.getColumnModel().getColumn(0).setPreferredWidth(0);
        controlador = 0;
        grafico.setBounds(5, 15, 650, 310);
        grafico.setBackground(Color.red);
        this.painelGrafico.add(grafico);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/icon.png")));
    }

    /*Funcao usada para gerar resultados de acordo com paramentros especificados*/
    public double funcao(double x, double y) {
        Expression exp = new ExpressionBuilder(txtFuncao.getText()).variables("x", "y").build().setVariable("x", x).setVariable("y", y);
        return exp.evaluate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        txtSolucao = new javax.swing.JTextField();
        butExport = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        painelGrafico = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        butsPainel = new javax.swing.JPanel();
        jB4 = new javax.swing.JButton();
        jB1 = new javax.swing.JButton();
        jB2 = new javax.swing.JButton();
        jB5 = new javax.swing.JButton();
        jB6 = new javax.swing.JButton();
        jB3 = new javax.swing.JButton();
        jBDivisor = new javax.swing.JButton();
        jBMultiplicador = new javax.swing.JButton();
        jBAdicionador = new javax.swing.JButton();
        jBSubtrador = new javax.swing.JButton();
        jBE = new javax.swing.JButton();
        jBLn = new javax.swing.JButton();
        jBX = new javax.swing.JButton();
        jBY = new javax.swing.JButton();
        jBSen = new javax.swing.JButton();
        jBCos = new javax.swing.JButton();
        jBTan = new javax.swing.JButton();
        jBElevado = new javax.swing.JButton();
        jBPi = new javax.swing.JButton();
        jBParente1 = new javax.swing.JButton();
        jBLog = new javax.swing.JButton();
        jBPonto = new javax.swing.JButton();
        jBParente2 = new javax.swing.JButton();
        jB7 = new javax.swing.JButton();
        jB8 = new javax.swing.JButton();
        jB9 = new javax.swing.JButton();
        butLimpar = new javax.swing.JButton();
        butCalcular = new javax.swing.JButton();
        jB0 = new javax.swing.JButton();
        butNovaF = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbFuncao = new javax.swing.JLabel();
        lbCondicao = new javax.swing.JLabel();
        txtCondicao = new javax.swing.JTextField();
        lbAltura = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        lbXo = new javax.swing.JLabel();
        lbYo = new javax.swing.JLabel();
        txtYinicial = new javax.swing.JTextField();
        txtCDecimais = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbOrdem = new javax.swing.JComboBox<>();
        txtFuncao = new javax.swing.JTextField();
        txtXinicial = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tabela.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "i", "Xi", "Yi", "k1", "k2", "k3", "k4", "Yi+1"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        txtSolucao.setEditable(false);
        txtSolucao.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        txtSolucao.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        butExport.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        butExport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Save1.png"))); // NOI18N
        butExport.setText("Exportar Tabela");
        butExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butExportActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Solução");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSolucao, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butExport, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(butExport, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtSolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelGrafico.setBackground(new java.awt.Color(255, 255, 255));
        painelGrafico.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gráfico", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 0, 14))); // NOI18N

        javax.swing.GroupLayout painelGraficoLayout = new javax.swing.GroupLayout(painelGrafico);
        painelGrafico.setLayout(painelGraficoLayout);
        painelGraficoLayout.setHorizontalGroup(
            painelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        painelGraficoLayout.setVerticalGroup(
            painelGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(painelGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Método Runge-Kutta");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        butsPainel.setBackground(new java.awt.Color(255, 255, 255));
        butsPainel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jB4.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jB4.setText("4");
        jB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB4ActionPerformed(evt);
            }
        });

        jB1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jB1.setText("1");
        jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });

        jB2.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jB2.setText("2");
        jB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB2ActionPerformed(evt);
            }
        });

        jB5.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jB5.setText("5");
        jB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB5ActionPerformed(evt);
            }
        });

        jB6.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jB6.setText("6");
        jB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB6ActionPerformed(evt);
            }
        });

        jB3.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jB3.setText("3");
        jB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB3ActionPerformed(evt);
            }
        });

        jBDivisor.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jBDivisor.setText("/");
        jBDivisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDivisorActionPerformed(evt);
            }
        });

        jBMultiplicador.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jBMultiplicador.setText("*");
        jBMultiplicador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMultiplicadorActionPerformed(evt);
            }
        });

        jBAdicionador.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jBAdicionador.setText("+");
        jBAdicionador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAdicionadorActionPerformed(evt);
            }
        });

        jBSubtrador.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jBSubtrador.setText("-");
        jBSubtrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSubtradorActionPerformed(evt);
            }
        });

        jBE.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jBE.setText("e");
        jBE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEActionPerformed(evt);
            }
        });

        jBLn.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jBLn.setText("log");
        jBLn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLnActionPerformed(evt);
            }
        });

        jBX.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jBX.setText("x");
        jBX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBXActionPerformed(evt);
            }
        });

        jBY.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jBY.setText("y");
        jBY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBYActionPerformed(evt);
            }
        });

        jBSen.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jBSen.setText("sen");
        jBSen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSenActionPerformed(evt);
            }
        });

        jBCos.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jBCos.setText("cos");
        jBCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCosActionPerformed(evt);
            }
        });

        jBTan.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jBTan.setText("tan");
        jBTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTanActionPerformed(evt);
            }
        });

        jBElevado.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jBElevado.setText("^");
        jBElevado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBElevadoActionPerformed(evt);
            }
        });

        jBPi.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jBPi.setText("Pi");
        jBPi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPiActionPerformed(evt);
            }
        });

        jBParente1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jBParente1.setText("(");
        jBParente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBParente1ActionPerformed(evt);
            }
        });

        jBLog.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jBLog.setText("√");
        jBLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLogActionPerformed(evt);
            }
        });

        jBPonto.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jBPonto.setText(".");
        jBPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPontoActionPerformed(evt);
            }
        });

        jBParente2.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jBParente2.setText(")");
        jBParente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBParente2ActionPerformed(evt);
            }
        });

        jB7.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jB7.setText("7");
        jB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB7ActionPerformed(evt);
            }
        });

        jB8.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jB8.setText("8");
        jB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB8ActionPerformed(evt);
            }
        });

        jB9.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jB9.setText("9");
        jB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB9ActionPerformed(evt);
            }
        });

        butLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancel.png"))); // NOI18N
        butLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butLimparActionPerformed(evt);
            }
        });

        butCalcular.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        butCalcular.setText("Calcular");
        butCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCalcularActionPerformed(evt);
            }
        });

        jB0.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jB0.setText("0");
        jB0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB0ActionPerformed(evt);
            }
        });

        butNovaF.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        butNovaF.setText("Limpar");
        butNovaF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butNovaFActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbFuncao.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        lbFuncao.setText("Função:");

        lbCondicao.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        lbCondicao.setText("Condição:");
        lbCondicao.setToolTipText("Condição de paragem");

        txtCondicao.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txtCondicao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCondicao.setToolTipText("Condição de paragem");
        txtCondicao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCondicaoFocusGained(evt);
            }
        });
        txtCondicao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCondicaoKeyTyped(evt);
            }
        });

        lbAltura.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        lbAltura.setText("Altura:");

        txtAltura.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txtAltura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAltura.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAlturaFocusGained(evt);
            }
        });
        txtAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlturaActionPerformed(evt);
            }
        });
        txtAltura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAlturaKeyTyped(evt);
            }
        });

        lbXo.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        lbXo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbXo.setText("Xo:");

        lbYo.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        lbYo.setText("Yo:");

        txtYinicial.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txtYinicial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtYinicial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtYinicialFocusGained(evt);
            }
        });
        txtYinicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtYinicialKeyTyped(evt);
            }
        });

        txtCDecimais.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        txtCDecimais.setModel(new javax.swing.SpinnerNumberModel(2, 1, 10, 1));
        txtCDecimais.setEditor(new javax.swing.JSpinner.NumberEditor(txtCDecimais, ""));
        txtCDecimais.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtCDecimaisStateChanged(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel7.setText("Nº de Casas:");

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel1.setText("Ordem:");

        cbOrdem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1ª Ordem", "2ª Ordem", "3ª Ordem", "4ª Ordem" }));
        cbOrdem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOrdemActionPerformed(evt);
            }
        });

        txtFuncao.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        txtFuncao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFuncao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFuncaoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFuncaoFocusLost(evt);
            }
        });
        txtFuncao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFuncaoKeyTyped(evt);
            }
        });

        txtXinicial.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txtXinicial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtXinicial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtXinicialFocusGained(evt);
            }
        });
        txtXinicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtXinicialKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCondicao)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addComponent(lbAltura, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCondicao, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbXo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbFuncao)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtXinicial, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbYo))
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCDecimais)
                            .addComponent(txtYinicial)))
                    .addComponent(txtFuncao))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cbOrdem, txtAltura, txtCondicao});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFuncao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(cbOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFuncao, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAltura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbAltura)
                        .addComponent(lbYo)
                        .addComponent(txtYinicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbXo)
                        .addComponent(txtXinicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCondicao)
                    .addComponent(txtCondicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtCDecimais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbOrdem, txtCDecimais, txtCondicao, txtFuncao, txtXinicial, txtYinicial});

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/backmenor.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout butsPainelLayout = new javax.swing.GroupLayout(butsPainel);
        butsPainel.setLayout(butsPainelLayout);
        butsPainelLayout.setHorizontalGroup(
            butsPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(butsPainelLayout.createSequentialGroup()
                .addGroup(butsPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(butsPainelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(butsPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jBTan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBCos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBSen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBPi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(butsPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(butsPainelLayout.createSequentialGroup()
                                .addGroup(butsPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jBParente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(butsPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jBParente2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBElevado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                                    .addComponent(jBY, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(butsPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(butsPainelLayout.createSequentialGroup()
                                        .addGroup(butsPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(butsPainelLayout.createSequentialGroup()
                                                .addComponent(jB4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jB5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jB6))
                                            .addGroup(butsPainelLayout.createSequentialGroup()
                                                .addComponent(jB1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jB2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jB3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(butsPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jBAdicionador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jBSubtrador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, butsPainelLayout.createSequentialGroup()
                                        .addComponent(jB0, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(butCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(butsPainelLayout.createSequentialGroup()
                                .addComponent(jBLn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(butsPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(butsPainelLayout.createSequentialGroup()
                                        .addComponent(jBX, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jB7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jB8, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                                    .addGroup(butsPainelLayout.createSequentialGroup()
                                        .addComponent(butNovaF, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(butsPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(butsPainelLayout.createSequentialGroup()
                                        .addComponent(jB9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBMultiplicador))
                                    .addGroup(butsPainelLayout.createSequentialGroup()
                                        .addComponent(butLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBDivisor, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        butsPainelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {butLimpar, jB0, jB1, jB2, jB3, jB4, jB5, jB6, jB7, jB8, jB9, jBAdicionador, jBCos, jBDivisor, jBE, jBElevado, jBLn, jBLog, jBMultiplicador, jBParente1, jBParente2, jBPi, jBPonto, jBSen, jBSubtrador, jBTan, jBX, jBY});

        butsPainelLayout.setVerticalGroup(
            butsPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(butsPainelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(butsPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(butNovaF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBDivisor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(butsPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSen, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBX)
                    .addComponent(jBLn)
                    .addComponent(jB7)
                    .addComponent(jB8)
                    .addComponent(jB9)
                    .addComponent(jBMultiplicador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(butsPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCos)
                    .addComponent(jB4)
                    .addComponent(jBY)
                    .addComponent(jBE)
                    .addComponent(jB5)
                    .addComponent(jB6)
                    .addComponent(jBAdicionador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(butsPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBTan)
                    .addComponent(jBLog)
                    .addComponent(jBElevado)
                    .addComponent(jB1)
                    .addComponent(jB2)
                    .addComponent(jB3)
                    .addComponent(jBSubtrador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(butsPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBParente1)
                    .addComponent(jBPi)
                    .addComponent(jBPonto)
                    .addComponent(jBParente2)
                    .addComponent(butCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB0))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        butsPainelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {butCalcular, jB0, jB1, jB2, jB3, jB4, jB5, jB6, jB7, jB8, jB9, jBAdicionador, jBCos, jBE, jBElevado, jBLn, jBLog, jBMultiplicador, jBParente1, jBParente2, jBPi, jBPonto, jBSen, jBSubtrador, jBTan, jBX, jBY});

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(butsPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butsPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void butCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCalcularActionPerformed
        calcular();
    }//GEN-LAST:event_butCalcularActionPerformed

    private void txtCondicaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCondicaoKeyTyped
//        char c = evt.getKeyChar();
//        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_PERIOD))) {
//            getToolkit().beep();
//            evt.consume();
//        }
    }//GEN-LAST:event_txtCondicaoKeyTyped

    private void txtAlturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAlturaKeyTyped
//        char c = evt.getKeyChar();
//        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_PERIOD))) {
//            getToolkit().beep();
//            evt.consume();
//        }
    }//GEN-LAST:event_txtAlturaKeyTyped

    private void txtXinicialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtXinicialKeyTyped
//        char c = evt.getKeyChar();
//        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_PERIOD))) {
//            getToolkit().beep();
//            evt.consume();
//        }
    }//GEN-LAST:event_txtXinicialKeyTyped

    private void txtYinicialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtYinicialKeyTyped
//        char c = evt.getKeyChar();
//        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_PERIOD))) {
//            getToolkit().beep();
//            evt.consume();
//        }
    }//GEN-LAST:event_txtYinicialKeyTyped

    private void butExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butExportActionPerformed

        int linha = tabela.getRowCount();
        if (linha <= 0) {
            JOptionPane.showMessageDialog(null, "Sem Resultado Para Exportar", "Erro", 0);
            return;
        }
        MessageFormat hearder = new MessageFormat("Resultdo do Metodo da" + " " + orderm);
        MessageFormat body = new MessageFormat("Page{0,number,integer}");
        try {
            tabela.print(JTable.PrintMode.NORMAL, hearder, body);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("Erro", e.getMessage());
        }
    }//GEN-LAST:event_butExportActionPerformed

    private void jB0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB0ActionPerformed
        if (memoria.equalsIgnoreCase("funcao")) {
            txtFuncao.setText(txtFuncao.getText() + "0");
        }

        if (memoria.equalsIgnoreCase("altura")) {
            txtAltura.setText(txtAltura.getText() + "0");
        }

        if (memoria.equalsIgnoreCase("x")) {
            txtXinicial.setText(txtXinicial.getText() + "0");
        }

        if (memoria.equalsIgnoreCase("y")) {
            txtYinicial.setText(txtYinicial.getText() + "0");
        }

        if (memoria.equalsIgnoreCase("fim")) {
            txtCondicao.setText(txtCondicao.getText() + "0");
        }
    }//GEN-LAST:event_jB0ActionPerformed

    private void jB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB7ActionPerformed
        if (memoria.equalsIgnoreCase("funcao")) {
            txtFuncao.setText(txtFuncao.getText() + "7");
        }

        if (memoria.equalsIgnoreCase("altura")) {
            txtAltura.setText(txtAltura.getText() + "7");
        }

        if (memoria.equalsIgnoreCase("x")) {
            txtXinicial.setText(txtXinicial.getText() + "7");
        }

        if (memoria.equalsIgnoreCase("y")) {
            txtYinicial.setText(txtYinicial.getText() + "7");
        }

        if (memoria.equalsIgnoreCase("fim")) {
            txtCondicao.setText(txtCondicao.getText() + "7");
        }
    }//GEN-LAST:event_jB7ActionPerformed

    private void jB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB4ActionPerformed
        if (memoria.equalsIgnoreCase("funcao")) {
            txtFuncao.setText(txtFuncao.getText() + "4");
        }

        if (memoria.equalsIgnoreCase("altura")) {
            txtAltura.setText(txtAltura.getText() + "4");
        }

        if (memoria.equalsIgnoreCase("x")) {
            txtXinicial.setText(txtXinicial.getText() + "4");
        }

        if (memoria.equalsIgnoreCase("y")) {
            txtYinicial.setText(txtYinicial.getText() + "4");
        }

        if (memoria.equalsIgnoreCase("fim")) {
            txtCondicao.setText(txtCondicao.getText() + "4");
        }
    }//GEN-LAST:event_jB4ActionPerformed

    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1ActionPerformed
        if (memoria.equalsIgnoreCase("funcao")) {
            txtFuncao.setText(txtFuncao.getText() + "1");
        }

        if (memoria.equalsIgnoreCase("altura")) {
            txtAltura.setText(txtAltura.getText() + "1");
        }

        if (memoria.equalsIgnoreCase("x")) {
            txtXinicial.setText(txtXinicial.getText() + "1");
        }

        if (memoria.equalsIgnoreCase("y")) {
            txtYinicial.setText(txtYinicial.getText() + "1");
        }

        if (memoria.equalsIgnoreCase("fim")) {
            txtCondicao.setText(txtCondicao.getText() + "1");
        }
    }//GEN-LAST:event_jB1ActionPerformed

    private void jB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB2ActionPerformed
        if (memoria.equalsIgnoreCase("funcao")) {
            txtFuncao.setText(txtFuncao.getText() + "2");
        }

        if (memoria.equalsIgnoreCase("altura")) {
            txtAltura.setText(txtAltura.getText() + "2");
        }

        if (memoria.equalsIgnoreCase("x")) {
            txtXinicial.setText(txtXinicial.getText() + "2");
        }

        if (memoria.equalsIgnoreCase("y")) {
            txtYinicial.setText(txtYinicial.getText() + "2");
        }

        if (memoria.equalsIgnoreCase("fim")) {
            txtCondicao.setText(txtCondicao.getText() + "2");
        }
    }//GEN-LAST:event_jB2ActionPerformed

    private void jB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB5ActionPerformed
        if (memoria.equalsIgnoreCase("funcao")) {
            txtFuncao.setText(txtFuncao.getText() + "5");
        }

        if (memoria.equalsIgnoreCase("altura")) {
            txtAltura.setText(txtAltura.getText() + "5");
        }

        if (memoria.equalsIgnoreCase("x")) {
            txtXinicial.setText(txtXinicial.getText() + "5");
        }

        if (memoria.equalsIgnoreCase("y")) {
            txtYinicial.setText(txtYinicial.getText() + "5");
        }

        if (memoria.equalsIgnoreCase("fim")) {
            txtCondicao.setText(txtCondicao.getText() + "5");
        }
    }//GEN-LAST:event_jB5ActionPerformed

    private void jB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB8ActionPerformed
        if (memoria.equalsIgnoreCase("funcao")) {
            txtFuncao.setText(txtFuncao.getText() + "8");
        }

        if (memoria.equalsIgnoreCase("altura")) {
            txtAltura.setText(txtAltura.getText() + "8");
        }

        if (memoria.equalsIgnoreCase("x")) {
            txtXinicial.setText(txtXinicial.getText() + "8");
        }

        if (memoria.equalsIgnoreCase("y")) {
            txtYinicial.setText(txtYinicial.getText() + "8");
        }

        if (memoria.equalsIgnoreCase("fim")) {
            txtCondicao.setText(txtCondicao.getText() + "8");
        }
    }//GEN-LAST:event_jB8ActionPerformed

    private void jB9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB9ActionPerformed
        if (memoria.equalsIgnoreCase("funcao")) {
            txtFuncao.setText(txtFuncao.getText() + "9");
        }

        if (memoria.equalsIgnoreCase("altura")) {
            txtAltura.setText(txtAltura.getText() + "9");
        }

        if (memoria.equalsIgnoreCase("x")) {
            txtXinicial.setText(txtXinicial.getText() + "9");
        }

        if (memoria.equalsIgnoreCase("y")) {
            txtYinicial.setText(txtYinicial.getText() + "9");
        }

        if (memoria.equalsIgnoreCase("fim")) {
            txtCondicao.setText(txtCondicao.getText() + "9");
        }
    }//GEN-LAST:event_jB9ActionPerformed

    private void jB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB6ActionPerformed
        if (memoria.equalsIgnoreCase("funcao")) {
            txtFuncao.setText(txtFuncao.getText() + "6");
        }

        if (memoria.equalsIgnoreCase("altura")) {
            txtAltura.setText(txtAltura.getText() + "6");
        }

        if (memoria.equalsIgnoreCase("x")) {
            txtXinicial.setText(txtXinicial.getText() + "6");
        }

        if (memoria.equalsIgnoreCase("y")) {
            txtYinicial.setText(txtYinicial.getText() + "6");
        }

        if (memoria.equalsIgnoreCase("fim")) {
            txtCondicao.setText(txtCondicao.getText() + "6");
        }
    }//GEN-LAST:event_jB6ActionPerformed

    private void jB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB3ActionPerformed
        if (memoria.equalsIgnoreCase("funcao")) {
            txtFuncao.setText(txtFuncao.getText() + "3");
        }

        if (memoria.equalsIgnoreCase("altura")) {
            txtAltura.setText(txtAltura.getText() + "3");
        }

        if (memoria.equalsIgnoreCase("x")) {
            txtXinicial.setText(txtXinicial.getText() + "3");
        }

        if (memoria.equalsIgnoreCase("y")) {
            txtYinicial.setText(txtYinicial.getText() + "3");
        }

        if (memoria.equalsIgnoreCase("fim")) {
            txtCondicao.setText(txtCondicao.getText() + "3");
        }
    }//GEN-LAST:event_jB3ActionPerformed

    private void jBDivisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDivisorActionPerformed
        txtFuncao.setText(txtFuncao.getText() + "/");
    }//GEN-LAST:event_jBDivisorActionPerformed

    private void jBMultiplicadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMultiplicadorActionPerformed
        txtFuncao.setText(txtFuncao.getText() + "*");
    }//GEN-LAST:event_jBMultiplicadorActionPerformed

    private void jBAdicionadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAdicionadorActionPerformed
        txtFuncao.setText(txtFuncao.getText() + "+");
    }//GEN-LAST:event_jBAdicionadorActionPerformed

    private void jBSubtradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSubtradorActionPerformed
        txtFuncao.setText(txtFuncao.getText() + "-");
    }//GEN-LAST:event_jBSubtradorActionPerformed

    private void jBSenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSenActionPerformed

        txtFuncao.setText(txtFuncao.getText() + "sin");
    }//GEN-LAST:event_jBSenActionPerformed

    private void jBCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCosActionPerformed
        txtFuncao.setText(txtFuncao.getText() + "cos");
    }//GEN-LAST:event_jBCosActionPerformed

    private void jBParente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBParente2ActionPerformed
        txtFuncao.setText(txtFuncao.getText() + ")");
    }//GEN-LAST:event_jBParente2ActionPerformed

    private void jBPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPontoActionPerformed
        if (memoria.equalsIgnoreCase("funcao")) {
            txtFuncao.setText(txtFuncao.getText() + ".");
        }

        if (memoria.equalsIgnoreCase("altura")) {
            txtAltura.setText(txtAltura.getText() + ".");
        }

        if (memoria.equalsIgnoreCase("x")) {
            txtXinicial.setText(txtXinicial.getText() + ".");
        }

        if (memoria.equalsIgnoreCase("y")) {
            txtYinicial.setText(txtYinicial.getText() + ".");
        }

        if (memoria.equalsIgnoreCase("fim")) {
            txtCondicao.setText(txtCondicao.getText() + ".");
        }
    }//GEN-LAST:event_jBPontoActionPerformed

    private void jBXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBXActionPerformed
        txtFuncao.setText(txtFuncao.getText() + "x");
    }//GEN-LAST:event_jBXActionPerformed

    private void jBParente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBParente1ActionPerformed
        txtFuncao.setText(txtFuncao.getText() + "(");
    }//GEN-LAST:event_jBParente1ActionPerformed

    private void butLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butLimparActionPerformed
        if (memoria.equalsIgnoreCase("funcao")) {
            txtFuncao.setText("");
        }

        if (memoria.equalsIgnoreCase("altura")) {
            txtAltura.setText("");
        }

        if (memoria.equalsIgnoreCase("x")) {
            txtXinicial.setText("");
        }

        if (memoria.equalsIgnoreCase("y")) {
            txtYinicial.setText("");
        }

        if (memoria.equalsIgnoreCase("fim")) {
            txtCondicao.setText("");
        }
    }//GEN-LAST:event_butLimparActionPerformed

    private void jBYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBYActionPerformed
        txtFuncao.setText(txtFuncao.getText() + "y");
    }//GEN-LAST:event_jBYActionPerformed

    private void jBElevadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBElevadoActionPerformed
        txtFuncao.setText(txtFuncao.getText() + "^");
    }//GEN-LAST:event_jBElevadoActionPerformed

    private void jBEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEActionPerformed
        txtFuncao.setText(txtFuncao.getText() + "exp");
    }//GEN-LAST:event_jBEActionPerformed

    private void jBLnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLnActionPerformed
        txtFuncao.setText(txtFuncao.getText() + "log");
    }//GEN-LAST:event_jBLnActionPerformed

    private void txtFuncaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFuncaoFocusLost

    }//GEN-LAST:event_txtFuncaoFocusLost

    private void txtFuncaoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFuncaoFocusGained
        memoria = "funcao";
        abiliar();
    }//GEN-LAST:event_txtFuncaoFocusGained

    private void txtAlturaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAlturaFocusGained
        memoria = "altura";
        desabilitar();
    }//GEN-LAST:event_txtAlturaFocusGained

    private void txtXinicialFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtXinicialFocusGained
        memoria = "X";
        desabilitar();
    }//GEN-LAST:event_txtXinicialFocusGained

    private void txtYinicialFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtYinicialFocusGained
        memoria = "Y";
        desabilitar();
    }//GEN-LAST:event_txtYinicialFocusGained

    private void txtCondicaoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCondicaoFocusGained
        memoria = "fim";
        desabilitar();
    }//GEN-LAST:event_txtCondicaoFocusGained

    private void jBPiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPiActionPerformed

        txtFuncao.setText(txtFuncao.getText() + "π");
    }//GEN-LAST:event_jBPiActionPerformed

    private void txtCDecimaisStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtCDecimaisStateChanged
        if (controlador==1||!(txtFuncao.getText().isEmpty() || txtCondicao.getText().isEmpty() || txtAltura.getText().isEmpty() || txtXinicial.getText().isEmpty() || txtYinicial.getText().isEmpty())) {
            calcular();
        }
    }//GEN-LAST:event_txtCDecimaisStateChanged

    private void jBTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTanActionPerformed
        txtFuncao.setText(txtFuncao.getText() + "tan");
    }//GEN-LAST:event_jBTanActionPerformed

    private void jBLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLogActionPerformed
        txtFuncao.setText(txtFuncao.getText() + "sqrt");
    }//GEN-LAST:event_jBLogActionPerformed


    private void cbOrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOrdemActionPerformed
        orderm = this.cbOrdem.getSelectedItem().toString();
        if (orderm.equalsIgnoreCase("1ª ordem")) {
            this.model.setColumnIdentifiers(colunasOrdem1);
            this.tabela.setModel(model);

            if (controlador == 1) {
                calcular();
            }
        }
        if (orderm.equalsIgnoreCase("2ª ordem")) {
            this.model.setColumnIdentifiers(colunasOrdem2);
            this.tabela.setModel(model);

            if (controlador == 1) {
                calcular();
            }
        }

        if (orderm.equalsIgnoreCase("3ª ordem")) {
            this.model.setColumnIdentifiers(colunasOrdem3);
            this.tabela.setModel(model);

            if (controlador == 1) {
                calcular();
            }
        }

        if (orderm.equalsIgnoreCase("4ª ordem")) {
            this.model.setColumnIdentifiers(colunasOrdem4);
            this.tabela.setModel(model);

            if (controlador == 1) {
                calcular();
            }
        }
    }//GEN-LAST:event_cbOrdemActionPerformed

    private void butNovaFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butNovaFActionPerformed
        txtAltura.setText("");
        txtCondicao.setText("");
        txtFuncao.setText("");
        txtXinicial.setText("");
        txtYinicial.setText("");
        int numLinhas = model.getRowCount();
        if (numLinhas > 0) {

            for (int i = 0; i < numLinhas; i++) {
                model.removeRow(0);
            }
        }
        controlador = 0;
        memoria = "";
        txtSolucao.setText("");
        grafico.removeAllPlots();
    }//GEN-LAST:event_butNovaFActionPerformed

    private void txtAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlturaActionPerformed

    private void txtFuncaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFuncaoKeyTyped

    }//GEN-LAST:event_txtFuncaoKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (memoria.equalsIgnoreCase("funcao")) {
            if (!txtFuncao.getText().isEmpty()) {
                txtFuncao.setText(txtFuncao.getText().substring(0, txtFuncao.getText().length() - 1));
            }
        }

        if (memoria.equalsIgnoreCase("altura")) {
            if (!txtAltura.getText().isEmpty()) {
                txtAltura.setText(txtAltura.getText().substring(0, txtAltura.getText().length() - 1));
            }
        }

        if (memoria.equalsIgnoreCase("x")) {
            if (!txtXinicial.getText().isEmpty()) {
                txtXinicial.setText(txtXinicial.getText().substring(0, txtXinicial.getText().length() - 1));
            }
        }

        if (memoria.equalsIgnoreCase("y")) {
            if (!txtYinicial.getText().isEmpty()) {
                txtYinicial.setText(txtYinicial.getText().substring(0, txtYinicial.getText().length() - 1));
            }
        }

        if (memoria.equalsIgnoreCase("fim")) {
            if (!txtCondicao.getText().isEmpty()) {
                txtCondicao.setText(txtCondicao.getText().substring(0, txtCondicao.getText().length() - 1));
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void calcular() {

        if (txtFuncao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Introduza a funcao", "Erro", 2);
            return;
        }

        if (txtAltura.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Introduza o valor da altura", "Erro", 2);
            return;
        }
        if (txtXinicial.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Introduza o valor inicial de X", "Erro", 2);
            return;
        }
        if (txtYinicial.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Introduza o valor inicial de Y", "Erro", 2);
            return;
        }

        if (txtCondicao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Introduza a condição de Paragem", "Erro", 2);
            return;
        }
        x = Double.parseDouble(txtXinicial.getText());
        y = Double.parseDouble(txtYinicial.getText());
        h = Double.parseDouble(txtAltura.getText());

        xf = Double.parseDouble(txtCondicao.getText());
        String casas = (String) txtCDecimais.getValue().toString();
        contador = 0;

        int numLinhas = model.getRowCount();
        if (numLinhas > 0) {

            for (int i = 0; i < numLinhas; i++) {
                model.removeRow(0);
            }
        }

        /*Primeira Ordem*/
        if (orderm.equalsIgnoreCase("1ª ordem")) {
            while (x <= xf) {

                f = funcao(x, y);
                yn1 = y + h * funcao(x, y);

                String F = format("%." + casas + "f%n", f);
                String Y = format("%." + casas + "f%n", y);
                String YN1 = format("%." + casas + "f%n", yn1);

                model.addRow(new String[]{contador + "", x + "", Y, F, YN1});

                contador += 1;
                x += h;
                y = yn1;
            }
        }

        /*Segunda Ordem*/
        if (orderm.equalsIgnoreCase("2ª ordem")) {
            while (x <= xf) {

                f = funcao(x, y);
                yn1 = y + h / 2 * (funcao(x, y) + funcao(x + h, y + h * funcao(x, y)));

                String F = format("%." + casas + "f%n", f);
                String Y = format("%." + casas + "f%n", y);
                String YN1 = format("%." + casas + "f%n", yn1);

                model.addRow(new String[]{contador + "", x + "", Y, F, YN1});
                contador += 1;
                x += h;
                y = yn1;
            }
        }

        /*Terceira Ordem*/
        if (orderm.equalsIgnoreCase("3ª ordem")) {
            while (x <= xf) {

                k1 = funcao(x, y);
                k2 = funcao(x + h / 2, y + k1 / 2);
                k3 = funcao(x + 3 * h / 4, y + 3 * k2 / 4);
                yn1 = y + 2 * k1 / 9 + k2 / 3 + 4 * k3 / 9;

                String Y = format("%." + casas + "f%n", y);
                String K1 = format("%." + casas + "f%n", k1);
                String K2 = format("%." + casas + "f%n", k2);
                String K3 = format("%." + casas + "f%n", k3);
                String YN1 = format("%." + casas + "f%n", yn1);

                model.addRow(new String[]{contador + "", x + "", Y, K1, K2, K3, YN1});
                contador += 1;
                x += h;
                y = yn1;
            }
        }
        /*Ordem 4*/
        if (orderm.equalsIgnoreCase("4ª ordem")) {
            while (x <= xf) {

                k1 = funcao(x, y);

                k2 = funcao(x + h / 2, y + h * k1 / 2);

                k3 = funcao(x + h / 2, y + h * k2 / 2);

                k4 = funcao(x + h, y + h * k3);

                yn1 = y + h / 6 * (k1 + 2 * k2 + 2 * k3 + k4);

                String Y = format("%." + casas + "f%n", y);
                String K1 = format("%." + casas + "f%n", k1);
                String K2 = format("%." + casas + "f%n", k2);
                String K3 = format("%." + casas + "f%n", k3);
                String K4 = format("%." + casas + "f%n", k4);
                String YN1 = format("%." + casas + "f%n", yn1);

                model.addRow(new String[]{contador + "", x + "", Y, K1, K2, K3, K4, YN1});

                contador += 1;
                x += h;
                y = yn1;
            }
        }
        String solucao = (String) tabela.getValueAt(tabela.getRowCount() - 2, tabela.getColumnCount() - 1);
        txtSolucao.setText(solucao);
        controlador = 1;
        grafico(tabela.getRowCount());
    }

    private void desabilitar() {
        jBCos.setEnabled(false);
//        jBAdicionador.setEnabled(false);
        jBDivisor.setEnabled(false);
        jBE.setEnabled(false);
        jBElevado.setEnabled(false);
        jBLn.setEnabled(false);
        jBLog.setEnabled(false);
        jBMultiplicador.setEnabled(false);
        jBParente1.setEnabled(false);
        jBParente2.setEnabled(false);
        jBSen.setEnabled(false);
        jBTan.setEnabled(false);
//        jBSubtrador.setEnabled(false);
        jBTan.setEnabled(false);
        jBX.setEnabled(false);
        jBY.setEnabled(false);
        jBPi.setEnabled(false);
    }

    private void abiliar() {
        jBCos.setEnabled(true);
//        jBAdicionador.setEnabled(true);
        jBDivisor.setEnabled(true);
        jBE.setEnabled(true);
        jBElevado.setEnabled(true);
        jBLn.setEnabled(true);
        jBLog.setEnabled(true);
        jBMultiplicador.setEnabled(true);
        jBParente1.setEnabled(true);
        jBParente2.setEnabled(true);
        jBSen.setEnabled(true);
        jBTan.setEnabled(true);
//        jBSubtrador.setEnabled(true);
        jBTan.setEnabled(true);
        jBX.setEnabled(true);
        jBY.setEnabled(true);
        jBPi.setEnabled(true);
    }

    private void grafico(int tamanho) {
        grafico.removeAllPlots();
        double[] xg = new double[tamanho];
        double[] yg = new double[tamanho];
        
        if(tamanho == 2){
            for (int i = 1; i <= tamanho; i++) {
                String xx1 = (String) tabela.getValueAt(0, i);
                String yy1 = (String) tabela.getValueAt(1, i);
                xg[i-1] = Double.parseDouble(xx1);
                yg[i-1] = Double.parseDouble(yy1);
            }
        }else{

            for (int i = 0; i < tamanho; i++) {
                String xx = (String) tabela.getValueAt(i, 1);
                String yy = (String) tabela.getValueAt(i, 2);

                xg[i] = Double.parseDouble(xx);
                yg[i] = Double.parseDouble(yy);
            }     
        }
        grafico.addLinePlot("", xg, yg);
        grafico.addScatterPlot("", Color.RED, xg, yg);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RungeKuttaRk4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butCalcular;
    private javax.swing.JButton butExport;
    private javax.swing.JButton butLimpar;
    private javax.swing.JButton butNovaF;
    private javax.swing.JPanel butsPainel;
    private javax.swing.JComboBox<String> cbOrdem;
    private javax.swing.JButton jB0;
    private javax.swing.JButton jB1;
    private javax.swing.JButton jB2;
    private javax.swing.JButton jB3;
    private javax.swing.JButton jB4;
    private javax.swing.JButton jB5;
    private javax.swing.JButton jB6;
    private javax.swing.JButton jB7;
    private javax.swing.JButton jB8;
    private javax.swing.JButton jB9;
    private javax.swing.JButton jBAdicionador;
    private javax.swing.JButton jBCos;
    private javax.swing.JButton jBDivisor;
    private javax.swing.JButton jBE;
    private javax.swing.JButton jBElevado;
    private javax.swing.JButton jBLn;
    private javax.swing.JButton jBLog;
    private javax.swing.JButton jBMultiplicador;
    private javax.swing.JButton jBParente1;
    private javax.swing.JButton jBParente2;
    private javax.swing.JButton jBPi;
    private javax.swing.JButton jBPonto;
    private javax.swing.JButton jBSen;
    private javax.swing.JButton jBSubtrador;
    private javax.swing.JButton jBTan;
    private javax.swing.JButton jBX;
    private javax.swing.JButton jBY;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbAltura;
    private javax.swing.JLabel lbCondicao;
    private javax.swing.JLabel lbFuncao;
    private javax.swing.JLabel lbXo;
    private javax.swing.JLabel lbYo;
    private javax.swing.JPanel painelGrafico;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JSpinner txtCDecimais;
    private javax.swing.JTextField txtCondicao;
    private javax.swing.JTextField txtFuncao;
    private javax.swing.JTextField txtSolucao;
    private javax.swing.JTextField txtXinicial;
    private javax.swing.JTextField txtYinicial;
    // End of variables declaration//GEN-END:variables

    private double x, y, f, h, xi, xf, yn1, k1, k2, k3, k4;
    int contador, controlador;
    private String leitura = "primeira";
    private String memoria = "";
}
