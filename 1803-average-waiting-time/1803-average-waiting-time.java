class Solution {
    public double averageWaitingTime(int[][] customers) {
        long timespend = 0;
        double totalWaitTime = 0;
        for(var entry : customers){
            long arrival = entry[0], timeToCook = entry[1];
            if(timespend == 0)timespend = arrival;
            long waitTime = timeToCook + ((arrival <= timespend) ? (timespend - arrival) : 0);
            timespend = Math.max(timespend, arrival);
            timespend += timeToCook;
            totalWaitTime += waitTime;
        }
        return (totalWaitTime / customers.length);
    }
}