class Solution {

    private final String KEY = "RAM";

    public String encode(List<String> strs) {
        // StringBuilder sb = new StringBuilder();
        // for(String s : strs){
        //     if(s.isEmpty()){
        //         sb.append("{_}").append(KEY);
        //     }else{
        //         sb.append(s).append(KEY);
        //     }
        // }
        // return sb.toString();

        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append(s.length())
                .append("#")
                .append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        // if(str.length() == 0){
        //     return new ArrayList<>();
        // }
        // String[] strs = str.split(KEY);
        // for(int i=0;i<strs.length;i++){
        //    strs[i]=strs[i].replace("{_}", "");
        // }
        // List<String> list = new ArrayList<>(Arrays.asList(strs));
        // return list;
        List<String> result = new ArrayList<>();
        int i = 0, j = 0;
        while(i < str.length()){
            j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i, j));
            result.add(str.substring(j+1, j+1+len));
            i = j+1+len;
        }
        return result;
    }
}
