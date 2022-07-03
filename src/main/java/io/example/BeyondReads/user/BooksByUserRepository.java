package io.example.BeyondReads.user;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

public interface BooksByUserRepository extends CassandraRepository<BooksByUser, String> {

    /**
     * get a slice of the data - books by user record
     */

    Slice<BooksByUser> findAllById(String id, Pageable pageable);

}
