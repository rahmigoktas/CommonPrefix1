public class Main {
    public static void main(String[] args) {
        String[] strs = {"atş","atkı","atıcı","atış","atilla"};
        System.out.println("Ortak önek: " + longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs)
    {
        if(strs==null || strs.length==0){return "Ortak ön ek bulunamadı";}

        int low=1;
        int high= strs[0].length();

        while(low<=high)
        {
            int mid=(low+high)/2;
            if(commonPrefix(strs,mid))
            {
               low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return strs[0].substring(0,(low+high)/2);

    }
    public static boolean commonPrefix(String[] strs ,int len)
    {
        String prefix=strs[0].substring(0,len);
        for(String str:strs)
        {
            if(!str.startsWith(prefix))
            {
                return false;
            }
        }
        return true;
    }
}