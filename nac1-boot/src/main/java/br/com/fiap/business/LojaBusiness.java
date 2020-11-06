package br.com.fiap.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.fiap.exception.ResponseBusinessException;
import br.com.fiap.model.LojaModel;
import br.com.fiap.repository.LojaRepository;

@Component
public class LojaBusiness {

	@Autowired
	public LojaRepository lojaRepository;

	public LojaModel applyBusiness(LojaModel loja) throws ResponseBusinessException {

		String url = changeUrlToLowerCase(loja.getUrlLoja());
		loja.setUrlLoja(url);

		verifyUrlLoja(loja.getUrlLoja());
		
		return loja;
	}

	private String changeUrlToLowerCase(String url) {
		return url.toLowerCase();
	}

	private void verifyUrlLoja(String url) throws ResponseBusinessException {
		String urlLoja = url.toLowerCase();

		if (urlLoja.contains("http://") || urlLoja.contains("http://")) {

		} else {
			throw new ResponseBusinessException("Não é possivel cadastrar uma url sem o endereço http:// ");
		}
	}

}
