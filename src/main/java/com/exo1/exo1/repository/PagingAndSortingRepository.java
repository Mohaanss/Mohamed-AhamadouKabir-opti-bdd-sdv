package com.exo1.exo1.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;


@NoRepositoryBean
public interface PagingAndSortingRepository<T, ID>  extends Repository<T,ID> {
    Iterable<T> findAll(Sort sort);
    Page<T> findAll(int page, int size);
}
