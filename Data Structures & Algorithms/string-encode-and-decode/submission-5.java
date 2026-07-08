class Solution {

    private final String KEY = "RAM";

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            if(s.isEmpty()){
                sb.append("{_}").append(KEY);
            }else{
                sb.append(s).append(KEY);
            }
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        if(str.length() == 0){
            return new ArrayList<>();
        }
        String[] strs = str.split(KEY);
        for(int i=0;i<strs.length;i++){
           strs[i]=strs[i].replace("{_}", "");
        }
        List<String> list = new ArrayList<>(Arrays.asList(strs));
        return list;
    }
}
