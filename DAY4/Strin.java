public class Strin {
    public static void main(String args[])
    {
        String name="delhi";
        name.concat("UUUP");
        System.out.println(name);
        String name1=name.concat("UUUP");   
        System.out.println(name1);
        //////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////
        String s1="SHUBH";
        String s2="SHUBH";
        System.out.println(s1.equals(s2));
        System.out.println(s1==(s2));
        /////////////////////////////////////////////////////////////////////
        String s3=new String("SHUBH");
        String s4=new String("SHUBH");
        System.out.println(s3.equals(s4));
        System.out.println(s3==(s4)); ///FLASE DUE TO OBJECT IS CREATED AND THEN ADDRESS ARE DIFFERENT
       //////////////////////////////////////
       String nam="delhi";
       System.out.println(nam.toUpperCase());
       System.out.println(nam.charAt(3));
       System.out.println(nam.contains("ih"));
       ////////////////////STRING BUFFER id mutable/////////////////////////////////////////////////
       StringBuffer sb=new StringBuffer("INDIA");
       StringBuffer sl=new StringBuffer("INDIA");
       System.out.println(sb.equals(sl));
       System.out.println(sb==(sl)); ///
       ////append string buffer//
       sb.append("UUUP");
       System.out.println(sb);
      //////////////////////////////////////

        
    }

    
}
