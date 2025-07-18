package main.server.compilation;

import com.querydsl.core.types.Predicate;
import main.server.compilation.model.Compilation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;


@Repository
public interface CompilationRepository extends JpaRepository<Compilation, Long>,
        QuerydslPredicateExecutor<Compilation> {
    @Override
    @NonNull
    Page<Compilation> findAll(@NonNull Predicate predicate, @NonNull Pageable pageable);
}
