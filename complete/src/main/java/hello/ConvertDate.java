package hello;

public class ConvertDate{
          
        // Print time in words.
        static void printWords(int h, int m, String hourProvided) throws Exception
            {
                if(hourProvided.length() > 5 || hourProvided.length() < 5 || !hourProvided.substring(2,3).equals(":")){

                    throw new Exception(" You must use this format HH:MM - 24 Hour Format - 05:00 ");

                }else{
                    
                    String nums[] = { "zero", "one", "two", "three", "four", 
                                        "five", "six", "seven", "eight", "nine", 
                                        "ten", "eleven", "twelve", "thirteen", 
                                        "fourteen", "fifteen", "sixteen", "seventeen", 
                                        "eighteen", "nineteen", "twenty", "twenty one", 
                                        "twenty two", "twenty three", "twenty four", 
                                        "twenty five", "twenty six", "twenty seven", 
                                        "twenty eight", "twenty nine", 
                                    }; 
                    // example - nums(10, 5)
                    if (m == 0) 
                        System.out.println(nums[h] + " o' clock "); 

                    else if (m == 1) 
                        System.out.println("one minute past " +  
                                                        nums[h]); 
                    else if (m == 10) 
                        System.out.println("ten minutes past " +  
                                                        nums[h]); 
                    else if (m == 15) 
                        System.out.println("quarter past " + nums[h]); 

                    else if (m == 30) 
                        System.out.println("half past " + nums[h]); 

                    else if (m == 45) 
                        System.out.println("quarter to " +  
                                            nums[(h % 12) + 1]); 
                    else if (m <= 30) 
                        System.out.println( nums[m] + " minutes past " + 
                                                                nums[h]); 
                    else if (m > 30) 
                        System.out.println( nums[60 - m] + " minutes to " +      
                                                            nums[(h % 12) + 1]);
                    }
             }
}