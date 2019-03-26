package com.company.movies.database.movies.director.generated;

import com.company.movies.database.movies.director.Director;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.ReferenceField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;
import com.speedment.runtime.typemapper.largeobject.BlobToByteArrayMapper;
import java.sql.Blob;
import java.util.Optional;

/**
 * The generated base for the {@link
 * com.company.movies.database.movies.director.Director}-interface representing
 * entities of the {@code director}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedDirector {
    
    /**
     * This Field corresponds to the {@link Director} field that can be obtained
     * using the {@link Director#getDirectorId()} method.
     */
    StringField<Director, String> DIRECTOR_ID = StringField.create(
        Identifier.DIRECTOR_ID,
        Director::getDirectorId,
        Director::setDirectorId,
        TypeMapper.identity(), 
        true
    );
    /**
     * This Field corresponds to the {@link Director} field that can be obtained
     * using the {@link Director#getDirfname()} method.
     */
    StringField<Director, String> DIRFNAME = StringField.create(
        Identifier.DIRFNAME,
        Director::getDirfname,
        Director::setDirfname,
        TypeMapper.identity(), 
        false
    );
    /**
     * This Field corresponds to the {@link Director} field that can be obtained
     * using the {@link Director#getDirsname()} method.
     */
    StringField<Director, String> DIRSNAME = StringField.create(
        Identifier.DIRSNAME,
        Director::getDirsname,
        Director::setDirsname,
        TypeMapper.identity(), 
        false
    );
    /**
     * This Field corresponds to the {@link Director} field that can be obtained
     * using the {@link Director#getPicture()} method.
     */
    ReferenceField<Director, Blob, byte[]> PICTURE = ReferenceField.create(
        Identifier.PICTURE,
        o -> OptionalUtil.unwrap(o.getPicture()),
        Director::setPicture,
        new BlobToByteArrayMapper(), 
        false
    );
    
    /**
     * Returns the directorId of this Director. The directorId field corresponds
     * to the database column database.movies.director.DIRECTOR_ID.
     * 
     * @return the directorId of this Director
     */
    String getDirectorId();
    
    /**
     * Returns the dirfname of this Director. The dirfname field corresponds to
     * the database column database.movies.director.DIRFNAME.
     * 
     * @return the dirfname of this Director
     */
    String getDirfname();
    
    /**
     * Returns the dirsname of this Director. The dirsname field corresponds to
     * the database column database.movies.director.DIRSNAME.
     * 
     * @return the dirsname of this Director
     */
    String getDirsname();
    
    /**
     * Returns the picture of this Director. The picture field corresponds to
     * the database column database.movies.director.PICTURE.
     * 
     * @return the picture of this Director
     */
    Optional<byte[]> getPicture();
    
    /**
     * Sets the directorId of this Director. The directorId field corresponds to
     * the database column database.movies.director.DIRECTOR_ID.
     * 
     * @param directorId to set of this Director
     * @return           this Director instance
     */
    Director setDirectorId(String directorId);
    
    /**
     * Sets the dirfname of this Director. The dirfname field corresponds to the
     * database column database.movies.director.DIRFNAME.
     * 
     * @param dirfname to set of this Director
     * @return         this Director instance
     */
    Director setDirfname(String dirfname);
    
    /**
     * Sets the dirsname of this Director. The dirsname field corresponds to the
     * database column database.movies.director.DIRSNAME.
     * 
     * @param dirsname to set of this Director
     * @return         this Director instance
     */
    Director setDirsname(String dirsname);
    
    /**
     * Sets the picture of this Director. The picture field corresponds to the
     * database column database.movies.director.PICTURE.
     * 
     * @param picture to set of this Director
     * @return        this Director instance
     */
    Director setPicture(byte[] picture);
    
    enum Identifier implements ColumnIdentifier<Director> {
        
        DIRECTOR_ID ("DIRECTOR_ID"),
        DIRFNAME    ("DIRFNAME"),
        DIRSNAME    ("DIRSNAME"),
        PICTURE     ("PICTURE");
        
        private final String columnName;
        private final TableIdentifier<Director> tableIdentifier;
        
        Identifier(String columnName) {
            this.columnName      = columnName;
            this.tableIdentifier = TableIdentifier.of(    getDbmsName(), 
                getSchemaName(), 
                getTableName());
        }
        
        @Override
        public String getDbmsName() {
            return "database";
        }
        
        @Override
        public String getSchemaName() {
            return "movies";
        }
        
        @Override
        public String getTableName() {
            return "director";
        }
        
        @Override
        public String getColumnName() {
            return this.columnName;
        }
        
        @Override
        public TableIdentifier<Director> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}