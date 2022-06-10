package arrays_easy;

import java.util.Arrays;

public class FlippingImage {
	
	static int[] reverse(int[] imageToRev) {
		int length = imageToRev.length ;
		int[] rev = new int[length];
		for(int i=0; i<imageToRev.length ; i++) {
			rev[(length-1)-i] = imageToRev[i] ;
			
		}
		return rev ;
	}
	
	static int[] invert(int[] imageToInvert) {
		for(int i=0; i<imageToInvert.length ; i++) {
			if(imageToInvert[i] ==  0  ) {
				imageToInvert[i] = 1;
			}
			else {
				imageToInvert[i] = 0;
			}
			
		}
		return imageToInvert ;
	}
	
	static int[][] flipAndInvertImage(int[][] image){
		
		int[][] newImage = new int[image.length][] ;
		
		for(int i =0 ;i <image.length ; i++) {
			int[] reverseImage = reverse(image[i]) ;
			System.out.println(Arrays.toString(reverseImage));
			int[] invertImage = invert(reverseImage);
			System.out.println(Arrays.toString(invertImage));
			newImage[i] = invertImage;
		}
		
		return newImage;
		
		
	}

	public static void main(String[] args) {
		int[][] image = {
				{1,1,0} ,
				{1,0,0} ,
				{0,0,0}
		};
		
		int[][] flippedImage = flipAndInvertImage( image) ;
		
		System.out.println(Arrays.deepToString(flippedImage));
	
	
	}

}
