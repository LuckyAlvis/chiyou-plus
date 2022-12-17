package common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期工具类
 */
public class DateUtils {

    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat dtf1 = new SimpleDateFormat("yyyy");
        SimpleDateFormat dtf2 = new SimpleDateFormat("yyyyy");
        SimpleDateFormat dtf4 = new SimpleDateFormat("MM");
        SimpleDateFormat dtf5 = new SimpleDateFormat("mm");
        SimpleDateFormat dtf6 = new SimpleDateFormat("DD");
        SimpleDateFormat dtf7 = new SimpleDateFormat("dd");
        SimpleDateFormat dtf8 = new SimpleDateFormat("HH");
        SimpleDateFormat dtf9 = new SimpleDateFormat("hh");
        SimpleDateFormat dtfa = new SimpleDateFormat("MM");
        SimpleDateFormat dtfb = new SimpleDateFormat("mm");
        SimpleDateFormat dtfc = new SimpleDateFormat("SS");
        SimpleDateFormat dtfd = new SimpleDateFormat("ss");
        SimpleDateFormat dtfe = new SimpleDateFormat("SSS");
        SimpleDateFormat dtfg = new SimpleDateFormat("sss");
        SimpleDateFormat dtfh = new SimpleDateFormat("sss");
        SimpleDateFormat dtfi = new SimpleDateFormat("EEE");
        SimpleDateFormat dtfk = new SimpleDateFormat("EE");
        SimpleDateFormat dtfl = new SimpleDateFormat("E");

        System.out.println("当前时间" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        System.out.println(dtf1.toPattern() + " \t " + dtf1.format(date));
        System.out.println(dtf2.toPattern() + " \t " + dtf2.format(date));
        System.out.println(dtf4.toPattern() + " \t " + dtf4.format(date));
        System.out.println(dtf5.toPattern() + " \t " + dtf5.format(date));
        System.out.println(dtf6.toPattern() + " \t " + dtf6.format(date));
        System.out.println(dtf7.toPattern() + " \t " + dtf7.format(date));
        System.out.println(dtf8.toPattern() + " \t " + dtf8.format(date));
        System.out.println(dtf9.toPattern() + " \t " + dtf9.format(date));
        System.out.println(dtfa.toPattern() + " \t " + dtfa.format(date));
        System.out.println(dtfb.toPattern() + " \t " + dtfb.format(date));
        System.out.println(dtfc.toPattern() + " \t " + dtfc.format(date));
        System.out.println(dtfd.toPattern() + " \t " + dtfd.format(date));
        System.out.println(dtfe.toPattern() + " \t " + dtfe.format(date));
        System.out.println(dtfg.toPattern() + " \t " + dtfg.format(date));
        System.out.println(dtfh.toPattern() + " \t " + dtfh.format(date));
        System.out.println(dtfi.toPattern() + " \t " + dtfi.format(date));
        System.out.println(dtfk.toPattern() + " \t " + dtfk.format(date));
        System.out.println(dtfl.toPattern() + " \t " + dtfl.format(date));
        Calendar cal = Calendar.getInstance();
        cal.set(2022, Calendar.NOVEMBER, 2);
        System.out.println(cal.getTime().getTime());
        System.out.println(new SimpleDateFormat("D").format(cal.getTime()));
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));
    }
}
