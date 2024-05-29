package com.akhilesh.programs.stringbufferprograms;

class TestStringBuffer {
    public static void main(String args[])
    {
       StringBuffer stringBuffer = new StringBuffer("Akhilesh");

        System.out.println("stringbuffer : "+stringBuffer );
        StringBuffer sb = stringBuffer.append("Pandey");
        System.out.println(sb.hashCode());
        System.out.println("stringbuffer : "+stringBuffer.hashCode() );


    }
}
