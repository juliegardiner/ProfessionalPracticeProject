package com.company.movies.database.movies.director.generated;

import com.company.movies.database.movies.director.Director;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;
import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.company.movies.database.movies.director.Director} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedDirectorManagerImpl extends AbstractManager<Director> implements GeneratedDirectorManager {
    
    private final TableIdentifier<Director> tableIdentifier;
    
    protected GeneratedDirectorManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("database", "movies", "director");
    }
    
    @Override
    public TableIdentifier<Director> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<Director>> fields() {
        return Stream.of(
            Director.DIRECTOR_ID,
            Director.DIRFNAME,
            Director.DIRSNAME,
            Director.PICTURE
        );
    }
    
    @Override
    public Stream<Field<Director>> primaryKeyFields() {
        return Stream.of(
            Director.DIRECTOR_ID
        );
    }
}