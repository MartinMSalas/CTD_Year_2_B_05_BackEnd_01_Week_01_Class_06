import java.util.ArrayList;
import java.util.List;
public class SerieProxy implements ISerie{
    private List<SerieInfo> serieInfoList= new ArrayList<>();
    private Serie serieServiceProvider;

    public SerieProxy(Serie serieServiceProvider) {

        this.serieServiceProvider = serieServiceProvider;
    }

    public List<SerieInfo> getSerieInfoList() {
        return serieInfoList;
    }

    public void setSerieInfoList(List<SerieInfo> serieInfoList) {
        this.serieInfoList = serieInfoList;
    }

    public Serie getSerieServiceProvider() {
        return serieServiceProvider;
    }

    public void setSerieServiceProvider(Serie serieServiceProvider) {
        this.serieServiceProvider = serieServiceProvider;
    }

    @Override
    public String getMovie(String movie) {
        String result= null;
        boolean found = false;
        if (serieInfoList != null){

            for (SerieInfo sinfo: serieInfoList
            ) {
                if(sinfo.getName() == movie){
                    found = true;
                    if(sinfo.getViewQuantity()<5){
                        result= serieServiceProvider.getMovie(movie);
                        sinfo.setViewQuantity(sinfo.getViewQuantity()+1);
                    } else{
                        try{
                            crashExeption();
                        } catch (SerieNoHabilitadaException e) {
                            System.out.println("Caught the exception");


                            System.out.println("Exception occured: " + e);

                        }

                    }

                }
            }
        }


        if(!found || serieInfoList == null){
            SerieInfo sinfo = new SerieInfo(movie,1);
            serieInfoList.add(sinfo);
            result= serieServiceProvider.getMovie(movie);
        }


        return result;
    }

    private void crashExeption() throws SerieNoHabilitadaException{
        throw new SerieNoHabilitadaException("This serie have been seen enough");
    }
}
