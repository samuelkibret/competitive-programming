 public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
              List<Integer> ans = new ArrayList<Integer>(grades.get(0));
           
              for(int i = 0 ; i < grades.size() ; i++){
                 Integer mark = grades.get(i) ;
                 // rounding
                 Integer difference = 5 - (mark % 5);
                  if( mark < 38 || difference >= 3){
                      ans.add(mark);
                  }
                  else if(difference < 3)
                  {
                      ans.add(mark + difference);
                  }
                  

              }
               return ans;
    }
