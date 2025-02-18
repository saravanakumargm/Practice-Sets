public class VersionStatus {
    public void version(String version1, String version2){
        for (int i = version1.length()-1; i >=0 ; i-=2) {
            if(Integer.parseInt(String.valueOf(version2.charAt(i)))< Integer.parseInt(String.valueOf(version1.charAt(i)))){
                System.out.println("Downgraded");
                return;
            }
        }
        System.out.println("Upgraded");
    }

    public static void main(String[] args) {
        new VersionStatus().version("4.8.2","4.8.1");
    }
}
