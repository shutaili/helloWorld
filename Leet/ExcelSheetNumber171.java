package com.example.neohelloworld.Leet;

public class ExcelSheetNumber171 {
    public static void main(String[] args) {
        ExcelSheetNumber171 excelSheetNumber171 = new ExcelSheetNumber171();
        System.out.println(excelSheetNumber171.titleToNumber("AB"));
    }

    public int titleToNumber(String s) {
        if(s.isEmpty()) return 0;

        int ret=0;
        char[] stringArray = s.toCharArray();

        for(int i=stringArray.length-1;i>=0;i--){
            ret+= (stringArray[i] - 'A' + 1) * Math.pow(26,stringArray.length-1-i);
        }

        return ret;
    }
}
