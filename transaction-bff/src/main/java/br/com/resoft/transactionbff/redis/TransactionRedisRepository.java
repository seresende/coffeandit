package br.com.resoft.transactionbff.redis;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.resoft.transactionbff.dto.TransactionDto;

@Repository
public interface TransactionRedisRepository extends CrudRepository<TransactionDto, String>{

}
