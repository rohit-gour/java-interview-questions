package GSQuestions;

public class xyz {
        public static int trap(int[] height) {
            int result=0;

            for(int i = 1; i<height.length-2; i++){
                int mh = height[i];
                for(int j = 0; j< i ; j++){
                    if( height[j]> mh){
                        mh = height[j];
                    }
                }
                int mxh = height[i];
                for(int j = i+1; j<height.length; j++){
                    if(height[j] >mxh){
                        mxh = height[j];
                    }
                }
                int wl;
                if(mh > mxh){
                    wl = mxh;
                }
                else
                    wl = mh;

                int tw = wl-height[i];
                result = result+tw;

            }
            return result;
        }

    public static void main(String[] args) {
            int [] h = {4,2,0,3,2,5};
        System.out.println(trap(h));
    }
}
