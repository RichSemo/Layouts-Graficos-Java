package usandoTabelas;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;    
  
/*public class ModelTabelaDados extends AbstractTableModel {       

    private static final long serialVersionUID = 1L;  
    private ArrayList<Conta> dados = null;       
  
    public ModelTabelaDados(ArrayList<Conta> dados) {       
        this.dados = dados;    
    }       
  
    @Override    
    public int getColumnCount() {       
        return 6; //quantidade de campos do que terá na tabela    
    }       
  
    @Override    
    public int getRowCount() {       
        if (this.dados == null) {       
            return 0;       
        } else {       
            return this.dados.size();          
        }       
    }       
  
    @Override    
    public Object getValueAt(int row, int column) {       
        Contas conta = (Contas) this.dados.get(row);   // RDV é o meu objeto bean com seus gets e sets    
  
        Object retorno = null;       
        if (column == 0) {   //pega os valores do objeto para retornar para a jTable    
            retorno = conta.getId();       
        } else if (column == 1) {    
            retorno = conta.getTipo();   
        } else if (column == 2) {       
            retorno = conta.getTaxa();       
        } else if (column == 3) {       
            retorno = conta.getValor();     
        } else if (column == 4) {       
            retorno = conta.getNome();       
        } else if (column == 5) {       
            retorno = conta.getData();       
        }     
  
        return retorno;       
  
    }       
  
    @Override    
    public String getColumnName(int column) {       
        String columnName = "";   //rotulo de cabeçalho das colunas do jTable    
        if (column == 0) {       
            columnName = "ID";       
        } else if (column == 1) {       
            columnName = "TIPO";       
        } else if (column == 2) {       
            columnName = "TAXA";       
        } else if (column == 3) {       
            columnName = "VALOR";       
        } else if (column == 4) {       
            columnName = "NOME";       
        } else if (column == 5) {       
            columnName = "DATA";       
        }      
        return columnName;       
    }    
}  
*/