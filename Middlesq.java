/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anilkaynar
 */
public class Middlesq {
      public long returnBase(long ar) {
          StringBuilder build=new StringBuilder();
          build.append(ar%10);
      for(int i=0;i<12;i++) {
          ar=ar/10;
          
          if(i==4 || i==5 || i==6 || i==7 || i==8 ) {
          build.append(ar%10);
          
          } }
      long donus=Long.valueOf(build.toString());
      
      return donus;
      }
      private long generateRando() {
      long k=1;
      k=returnBase(System.currentTimeMillis());
      int count =(int) k%40;
      for(int i=0;i<count;i++) {
          k=returnBase(k*k*k);
      }
      return k;
      }
      public long generateRandom(int bound) {
           return generateRando()%bound;
      }
}
