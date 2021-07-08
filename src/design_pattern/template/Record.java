package design_pattern.template;

public abstract class Record {

    private DbObject dbObject;

    public void setDbObject(DbObject dbObject) {
        this.dbObject = dbObject;
    }

    public void save( ) throws Exception {
        System.out.println("Save method is called");
        this.validateConnection();
        this.validateObject();
        this.beforeSave();
        System.out.println("Saving into database");
        this.afterSave();
    }

    public void validateConnection(){
        System.out.println("Connection validation is called");
    }

    public void validateObject() throws Exception {
        if(this.dbObject == null){
            System.out.println("Can not save");
            throw new Exception("Con not save. Db object is null");
        }
    }

    public abstract void beforeSave();
    public abstract void afterSave();
}
