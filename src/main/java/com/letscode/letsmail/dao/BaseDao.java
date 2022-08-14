package com.letscode.letsmail.dao;

import java.util.List;

public interface BaseDao<T, I> {

    T buscar(I id);

    List<T> listar();

    T salvar(T entity);

    void deletar(I id);

    T atualizar(I id, T newEntity);
}
