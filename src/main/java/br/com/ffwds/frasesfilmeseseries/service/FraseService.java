package br.com.ffwds.frasesfilmeseseries.service;

import br.com.ffwds.frasesfilmeseseries.dto.FraseDTO;
import br.com.ffwds.frasesfilmeseseries.model.Frase;
import br.com.ffwds.frasesfilmeseseries.repository.FraseRepository;

public class FraseService {
    private FraseRepository repositorio;
    public FraseDTO obterFraseAleatoria(){
        Frase frase = repositorio.buscaFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
