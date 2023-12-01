package com.sistematizacao.sistema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.sistematizacao.sistema.models.EntregadoresModel;

@Repository
public interface EntregadoresRepository extends JpaRepository<EntregadoresModel, Integer>{

	@Query(value = "SELECT * FROM entregadores WHERE cpf = ?1", nativeQuery = true)
	

	
	EntregadoresModel findEntregadoresByCpf (String cpf);
}