int v = arr.get(n-1); // take last number
            int i = n-2; // get last but one index
            while(i>=0 && v < arr.get(i)) {  // continue the loop till i>=0 and value < ith value
                if(arr.get(i) > v)
                    arr.set(i+1, arr.get(i)); // if value < ith value, shift ith value to i+1 th index
                i--; // go to left
                for(int x:arr) System.out.print(x +" "); // print the array in each setp
                System.out.println();
            }
            arr.set(i+1, v); // at ent set i+th value to value selected in the begining
            for(int x:arr) System.out.print(x +" "); // print the array again
            System.out.println();
