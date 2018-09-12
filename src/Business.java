public class Business {

    private IDeviceWriter writer;

    public void setWriter(IDeviceWriter writer) {
        this.writer = writer;
    }

    public IDeviceWriter getWriter() {
        return writer;
    }

    public void save(){
        if (writer == null){
            throw new RuntimeException("No writer found...");
        }
        writer.saveToDevice();
    }
}
