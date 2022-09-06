package TravelsDAO;

import Factory.ConnectionFactory;
import com.mycompany.travels.Cliente;
import com.mycompany.travels.Passagem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TravelsDAO {
    public void cadastrarCliente(Cliente cliente) {
        String sql = "INSERT INTO cliente(cpf, nome, telefone, email, cep) VALUES (?, ?, ?, ?, ?)";
        
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try {
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, cliente.getCpf());
            pstm.setString(2, cliente.getNome());
            pstm.setString(3, cliente.getTelefone());
            pstm.setString(4, cliente.getEmail());
            pstm.setString(5, cliente.getCep());
            
            pstm.execute();
            
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                
                if (conn != null) {
                    conn.close();
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public List<Cliente> listarCliente() {
        String sql = "SELECT * FROM cliente";
        
        List<Cliente> cliente = new ArrayList<Cliente>();
        
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        
        try {
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            
            rset = pstm.executeQuery();
            
            while (rset.next()) {                
                Cliente c = new Cliente();
                c.setId(rset.getInt("id"));
                c.setNome(rset.getString("nome"));
                c.setEmail(rset.getString("email"));
                c.setCep(rset.getString("cep"));
                c.setCpf(rset.getString("cpf"));
                c.setTelefone(rset.getString("telefone"));
                
                cliente.add(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (rset != null) {
                    rset.close();
                }

                if (pstm != null) {
                    pstm.close();
                }

                if (conn != null) {
                    conn.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return cliente;
    }
    
    public void editarCliente(Cliente cliente) {
        String sql = "UPDATE cliente SET nome = ?, cpf = ?, telefone = ?, email = ?, cep = ? WHERE id = ?";
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try {
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, cliente.getNome());
            pstm.setString(2, cliente.getCpf());
            pstm.setString(3, cliente.getTelefone());
            pstm.setString(4, cliente.getEmail());
            pstm.setString(5, cliente.getCep());
            
            pstm.setInt(6, cliente.getId());
            pstm.execute();
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                
                if (conn != null) {
                    conn.close();
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public void deletarCliente(int id) {
        String sql = "DELETE FROM cliente WHERE id = ?";
        
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try {
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setInt(1, id);
            pstm.execute();
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(pstm != null) {
                    pstm.close();
                }
                
                if (conn != null) {
                    conn.close();
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public void emitirPassagem(Passagem passagem) {
        String sql = "INSERT INTO passagem(dia, mes, ano, horario, destino, partida, chegada, valor, desconto, poltrona) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try {
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setInt(1, passagem.getDia());
            pstm.setInt(2, passagem.getMes());
            pstm.setInt(3, passagem.getAno());
            pstm.setDouble(4, passagem.getHorario());
            pstm.setString(5, passagem.getDestino());
            pstm.setString(6, passagem.getPartida());
            pstm.setString(7, passagem.getChegada());
            pstm.setDouble(8, passagem.getValor());
            pstm.setDouble(9, passagem.getDesconto());
            pstm.setInt(10, passagem.getPoltrona());
            
            pstm.execute();
            
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                
                if (conn != null) {
                    conn.close();
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public List<Passagem> listarPassagem() {
        String sql = "SELECT * FROM passagem";
        
        List<Passagem> passagem = new ArrayList<Passagem>();
        
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        
        try {
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            rset = pstm.executeQuery();
            
            while (rset.next()) {                
                Passagem p = new Passagem();
                p.setDia(rset.getInt("dia"));
                p.setMes(rset.getInt("mes"));
                p.setAno(rset.getInt("ano"));
                p.setHorario(rset.getDouble("horario"));
                p.setDestino(rset.getString("destino"));
                p.setPartida(rset.getString("partida"));
                p.setChegada(rset.getString("chegada"));
                p.setValor(rset.getDouble("valor"));
                p.setDesconto(rset.getDouble("desconto"));
                p.setPoltrona(rset.getInt("poltrona"));
                passagem.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (rset != null) {
                    rset.close();
                }

                if (pstm != null) {
                    pstm.close();
                }

                if (conn != null) {
                    conn.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return passagem;
    }
    
    public void editarPassagem(Passagem passagem) {
        String sql = "UPDATE passagem SET dia = ?, mes = ?, ano = ?, horario = ?, destino = ?, partida = ?, chegada = ?, valor = ?, desconto = ?, poltrona = ? WHERE id = ?";
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try {
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setInt(1, passagem.getDia());
            pstm.setInt(2, passagem.getMes());
            pstm.setInt(3, passagem.getAno());
            pstm.setDouble(4, passagem.getHorario());
            pstm.setString(5, passagem.getDestino());
            pstm.setString(6, passagem.getPartida());
            pstm.setString(7, passagem.getChegada());
            pstm.setDouble(8, passagem.getValor());
            pstm.setDouble(9, passagem.getDesconto());
            pstm.setInt(10, passagem.getPoltrona());
            
            pstm.setInt(11, passagem.getId());
            pstm.execute();
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                
                if (conn != null) {
                    conn.close();
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public void deletarPassagem(int id) {
        String sql = "DELETE FROM passagem WHERE id = ?";
        
        Connection conn = null;
        PreparedStatement pstm = null;
        
        try {
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setInt(1, id);
            pstm.execute();
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(pstm != null) {
                    pstm.close();
                }
                
                if (conn != null) {
                    conn.close();
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
