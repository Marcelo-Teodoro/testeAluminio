package dao;
import classe.Cliente;
import dao.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pgz
 */
public class ClienteDao {

    // Comentário feito por Adonis

    public int save(Cliente cliente) throws SQLException, ClassNotFoundException {

        //inicializando o retorno da função, caso tenha algum problema deve retornar o valor -1
        int resultado = -1;

        Connection conn = ConnectionManager.getConnection();

        PreparedStatement stmt = null;
        String QUERY_INSERT = "insert into cliente (nome) values (?)";
        String QUERY_UPDATE = "update cliente set nome = ? where idusuario = ? ";

        if (cliente.getId()== null) {

            stmt = conn.prepareStatement(QUERY_INSERT, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, cliente.getNome());

            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();

            if (rs.next()) {
                resultado = rs.getInt(1);
            }
            conn.close();
            stmt.close();

        } else {

            stmt = conn.prepareStatement(QUERY_UPDATE);
            stmt.setString(1, cliente.getNome());

            stmt.executeUpdate();
            resultado = cliente.getId();
            conn.close();
            stmt.close();
        }


        return resultado;
    }

//    public boolean delete(Usuario usuario) throws SQLException, ClassNotFoundException {
//
//        boolean resultado = false;
//        Connection conn = ConnectionManager.getConnection();
//
//
//        PreparedStatement stmt = null;
//
//        String QUERY_DELETE = "delete from usuario where idusuario = ?";
//
//        stmt = conn.prepareStatement(QUERY_DELETE);
//        stmt.setInt(1, usuario.getIdUsuario());
//
//        stmt.executeUpdate();
//        conn.close();
//        stmt.close();
//
//        resultado = true;
//
//
//        return resultado;
//    }
//
//    public Usuario byEmailSenhaEmpresa (String email, String senha, String idEmpresa) throws ClassNotFoundException, SQLException{
//        Integer idUsuario = null;
//        Usuario usuario = new Usuario();
//
//        Connection conn = ConnectionManager.getConnection();
//
//        try{
//
//            String Query_Pesquisa = "select * from usuario where email = ? "
//                    + "and senha = ? and empresa_idempresa = ?";
//            PreparedStatement stmt = null;
//
//            ResultSet rs = null;
//
//            stmt = conn.prepareStatement(Query_Pesquisa);
//            stmt.setString(1, email);
//            stmt.setString(2, senha);
//            stmt.setString(3, idEmpresa);
//
//            rs = stmt.executeQuery();
//
//            while (rs.next()) {
//                usuario.setIdUsuario(rs.getInt("idusuario"));
//                usuario.setNome(rs.getString("nome"));
//                usuario.setEmail(rs.getString("email"));
//                usuario.setSenha(rs.getString("senha"));
//                usuario.setNivel(rs.getString("nivel"));
//                usuario.setTelefoneComercial(rs.getString("telefoneComercial"));
//                usuario.setTelefoneCelular(rs.getString("telefoneCelular"));
//                usuario.setIdEmpresa(rs.getInt("empresa_idempresa"));
//            }
//
//            conn.close();
//
//        }catch (Exception ex) {
//
//            ex.printStackTrace();
//            usuario = null;
//
//        }
//
//        return usuario;
//
//    }
//
//    public Usuario getByID (Integer id) throws SQLException, ClassNotFoundException{
//        Integer idUsuario = null;
//        Usuario usuario = new Usuario();
//
//        Connection conn = ConnectionManager.getConnection();
//
//
//
//        String Query_Pesquisa = "select * from usuario where idusuario = ?";
//        PreparedStatement stmt = null;
//
//        ResultSet rs = null;
//
//        stmt = conn.prepareStatement(Query_Pesquisa);
//        stmt.setInt(1, id);
//
//        rs = stmt.executeQuery();
//
//        while (rs.next()) {
//            usuario.setIdUsuario(rs.getInt("idusuario"));
//            usuario.setNome(rs.getString("nome"));
//            usuario.setEmail(rs.getString("email"));
//            usuario.setSenha(rs.getString("senha"));
//            usuario.setNivel(rs.getString("nivel"));
//            usuario.setTelefoneComercial(rs.getString("telefoneComercial"));
//            usuario.setTelefoneCelular(rs.getString("telefoneCelular"));
//            usuario.setIdEmpresa(rs.getInt("empresa_idempresa"));
//        }
//
//        conn.close();
//        stmt.close();
//
//
//
//        return usuario;
//
//    }
//
//    public List<Usuario> getAll () throws SQLException, ClassNotFoundException{
//        List<Usuario> usuarioList = new ArrayList<Usuario>();
//        Usuario usuario;
//
//        Connection conn = ConnectionManager.getConnection();
//
//
//
//        String Query_Pesquisa = "select * from usuario";
//        PreparedStatement stmt = null;
//
//        ResultSet rs = null;
//
//        stmt = conn.prepareStatement(Query_Pesquisa);
//
//        rs = stmt.executeQuery();
//
//        while (rs.next()) {
//            usuario = new Usuario();
//            usuario.setIdUsuario(rs.getInt("idusuario"));
//            usuario.setNome(rs.getString("nome"));
//            usuario.setEmail(rs.getString("email"));
//            usuario.setSenha(rs.getString("senha"));
//            usuario.setNivel(rs.getString("nivel"));
//            usuario.setTelefoneComercial(rs.getString("telefoneComercial"));
//            usuario.setTelefoneCelular(rs.getString("telefoneCelular"));
//            usuario.setIdEmpresa(rs.getInt("empresa_idempresa"));
//            usuarioList.add(usuario);
//        }
//
//        conn.close();
//        stmt.close();
//
//
//
//        return usuarioList;
//


}
