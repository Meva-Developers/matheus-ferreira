package br.com.alura.forum.controller;

import br.com.alura.forum.modelo.Topico;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.asm.Advice;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TopicoDto  {

    private  Long id;
    private  String titulo;
    private  String mensagem;
    private  LocalDateTime dataCriacao;

    public List<Topico> converter(List<TopicoDto> dto) {
        List<Topico> topicos = new ArrayList<>();
        for (TopicoDto topicoDto : dto) {
            topicos.add(Topico.builder().id(id).titulo(titulo).mensagem(mensagem).dataCriacao(dataCriacao).build());
        }
        return topicos;
    }

/*    public List<Topico> converter(List<TopicoDto> dto) {
        List<Topico> topicos = new ArrayList<>();
        for (TopicoDto topicoDto: dto) {
            topicos.add(Topico.builder().id(id).titulo(titulo).mensagem(mensagem).dataCriacao(dataCriacao).build();
        }
        return topicos;
    }*/
}
