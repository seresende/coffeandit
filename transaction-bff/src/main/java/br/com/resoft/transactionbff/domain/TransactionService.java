package br.com.resoft.transactionbff.domain;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.resoft.transactionbff.dto.RequestTransactionDto;
import br.com.resoft.transactionbff.dto.TransactionDto;
import br.com.resoft.transactionbff.redis.TransactionRedisRepository;

@Service
public class TransactionService {


	private TransactionRedisRepository transactionRedisRepository;

	public TransactionService(TransactionRedisRepository transactionRedisRepository) {
		this.transactionRedisRepository = transactionRedisRepository;

	}
	
	public  Optional<TransactionDto> save(final RequestTransactionDto requestTransactionDto) {
		
		return Optional.of(transactionRedisRepository.save(requestTransactionDto));
			
	}
	
	
}
