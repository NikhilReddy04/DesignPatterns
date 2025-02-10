public class OsFactory {
    public Os getOs(String requirement){
        if(requirement=="Most functional OS"){
            return new Android();
        }
        else if(requirement=="Most secure OS"){
            return new Ios();
        }
        return new Windows();
    }
}
