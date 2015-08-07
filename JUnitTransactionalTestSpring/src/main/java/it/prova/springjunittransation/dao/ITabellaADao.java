package it.prova.springjunittransation.dao;

public interface ITabellaADao {

	static final String SELECT_TABLE_A = "SELECT * FROM TABELLA_A";

	static final String INSERT_TABLE_A = "INSERT INTO TABELLA_A VALUES (?,?)";

	public TabellaA select();

	public void insert(TabellaA record);
}
