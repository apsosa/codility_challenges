public class ValidTimes {
    public int validTimes(int A, int B, int C, int D){
        int validTimes = 0;
        String digit1 = Integer.toString(A);
        String digit2 = Integer.toString(B);
        String digit3 = Integer.toString(C);
        String digit4 = Integer.toString(D);
    
        String ab = digit1+digit2;
        String ac = digit1+digit3;
        String ad = digit1+digit4;
        int hour1 = Integer.parseInt(ab);
        int hour2 = Integer.parseInt(ac);
        int hour3 = Integer.parseInt(ad);
        if(hour1 < 24 && hour2 < 60 ){
            validTimes++;
        }
        if(hour1 < 24 && hour3 < 60){
            validTimes++;
        }
        if(hour2 < 24 && hour1 <60 ){
            validTimes++;
        }
        if(hour2 < 24 && hour3 <60){
            validTimes++;
        }
        if(hour3 < 24 && hour1 <60){
            validTimes++;
        }
        if(hour3 < 24 && hour2 <60){
            validTimes++;
        }

        String ba = digit2+digit1;
        String bc = digit2+digit3;
        String bd = digit2+digit4;
        hour1 = Integer.parseInt(ba);
        hour2 = Integer.parseInt(bc);
        hour3 = Integer.parseInt(bd);
        if(hour1 < 24 && hour2 < 60 ){
            validTimes++;
        }
        if(hour1 < 24 && hour3 < 60){
            validTimes++;
        }
        if(hour2 < 24 && hour1 <60 ){
            validTimes++;
        }
        if(hour2 < 24 && hour3 <60){
            validTimes++;
        }
        if(hour3 < 24 && hour1 <60){
            validTimes++;
        }
        if(hour3 < 24 && hour2 <60){
            validTimes++;
        }

        String ca = digit2+digit1;
        String cb = digit2+digit3;
        String cd = digit2+digit4;
        hour1 = Integer.parseInt(ca);
        hour2 = Integer.parseInt(cb);
        hour3 = Integer.parseInt(cd);
        if(hour1 < 24 && hour2 < 60 ){
            validTimes++;
        }
        if(hour1 < 24 && hour3 < 60){
            validTimes++;
        }
        if(hour2 < 24 && hour1 <60 ){
            validTimes++;
        }
        if(hour2 < 24 && hour3 <60){
            validTimes++;
        }
        if(hour3 < 24 && hour1 <60){
            validTimes++;
        }
        if(hour3 < 24 && hour2 <60){
            validTimes++;
        }

        String da = digit2+digit1;
        String db = digit2+digit3;
        String dc = digit2+digit4;
        hour1 = Integer.parseInt(da);
        hour2 = Integer.parseInt(db);
        hour3 = Integer.parseInt(dc);
        if(hour1 < 24 && hour2 < 60 ){
            validTimes++;
        }
        if(hour1 < 24 && hour3 < 60){
            validTimes++;
        }
        if(hour2 < 24 && hour1 <60 ){
            validTimes++;
        }
        if(hour2 < 24 && hour3 <60){
            validTimes++;
        }
        if(hour3 < 24 && hour1 <60){
            validTimes++;
        }
        if(hour3 < 24 && hour2 <60){
            validTimes++;
        }
        //cheak repetions and subtrac
        if(A==B || A==C || A ==D){
            validTimes = validTimes /2;
        }
        return validTimes;
    }
}
