package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class SortDateList {

    private final String dateFormatForPsi="yyyyMMdd";
    private final String datePatternforScanTimeOld = "MM/dd/yyyy HH:mm:ss";
    private SimpleDateFormat psiRecordDateFormatter = new SimpleDateFormat(dateFormatForPsi);
    private SimpleDateFormat simpleDateFormatForScanTimeOld = new SimpleDateFormat(datePatternforScanTimeOld);



    public Date getValidDate(String dateStr) throws ParseException {
        Date date = null;
        if(dateStr.length() == 8){
            date = psiRecordDateFormatter.parse(dateStr);
        }else{
            date = simpleDateFormatForScanTimeOld.parse(dateStr);
        }
        return date;
    }

    public void sortDate() throws ParseException {
        List<Date> dates = new ArrayList<>();
        dates.add(this.getValidDate("04/17/2021 13:42:33"));
        dates.add(this.getValidDate("04/19/2021 11:42:19"));
        dates.add(this.getValidDate("04/18/2021 18:15:37"));
        dates.add(this.getValidDate("04/1/2021 15:10:17"));
        dates.add(this.getValidDate("04/1/2021 18:10:17"));

        Collections.sort(dates);
        for(Date date : dates){
            System.out.println(date.toString());
        }
    }
}
