package br.com.projeto.bitcoin.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InserirDados {
	
	 private static final String URL = "jdbc:h2:mem:bitcoin";
	 private static final String USUARIO = "h2";
	 private static final String SENHA = "pass";
	 
	 public void insereDadosTotal() {
		 try (Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA)) {
	            String sql = "INSERT INTO TOTAL (enviado, recebido) VALUES (?, ?)";
	            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
	                 preparedStatement.setInt(1, (int) 1189163719343L);
	                 preparedStatement.setInt(2, (int) 1189307731097L);
	                preparedStatement.executeUpdate();
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		}
	 
	 public void insereDadosSaldo() {
		 try (Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA)) {
	            String sql = "INSERT INTO SALDO_DETALHADO (confirmado, nao_confirmado) VALUES (?, ?)";
	            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
	                 preparedStatement.setString(1, "123213");
	                 preparedStatement.setString(2, "17000");
	                 preparedStatement.executeUpdate();
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		}

	 public void insereDadosBitcoin() {
	 try (Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA)) {
            String sql = "INSERT INTO tb_bitcoin (endereco, saldo, saldo_detalhado, taxa_tx, total) " +
                    "VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            	 preparedStatement.setString(1, "bc1qyzxdu4px4jy8gwhcj82zpv7qzhvc0fvumgnh0r");
                 preparedStatement.setString(2, "144011754");
                 preparedStatement.setString(3, "1");
                 preparedStatement.setString(4, "17000");
                 preparedStatement.setString(5, "1");
                 preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
	 
	 /*public void insereDados() {
		 Bitcoin bitcoin = new Bitcoin();
		 SaldoDetalhado s = new SaldoDetalhado();
		 Total t = new Total();
		 t.setEnviado(BigInteger.valueOf(1189163719343L));
		 t.setRecebido(BigInteger.valueOf(1189307731097L));
		 s.setSaldoConfirmado(BigInteger.valueOf(1321321));
		 s.setSaldoNaoConfirmado(BigInteger.valueOf(123213));
	     bitcoin.setEndereco("bc1qyzxdu4px4jy8gwhcj82zpv7qzhvc0fvumgnh0r");
	     bitcoin.setSaldo(BigInteger.valueOf(144011754));
	     bitcoin.setSaldoConfirmado(s);
	     bitcoin.setSaldoNaoConfirmado(s);
	     bitcoin.setTaxaTX(BigInteger.valueOf(17000));
	     bitcoin.setTotalEnviado(t);
	     bitcoin.setTotalRecebido(t);

	     bitcoinRepository.save(bitcoin);
	}*/
}
