public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket,int extraBuckets){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }

        double requiredBucket = (width * height) / areaPerBucket;

        if (extraBuckets > requiredBucket){
            return 0;
        }

        return (int) Math.ceil((double) (requiredBucket - extraBuckets));

    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 ){
            return -1;
        }

        double requiredBucket = (width * height) / areaPerBucket;


        return (int) Math.ceil((double) requiredBucket);

    }

    public static int getBucketCount(double areaOfWall, double areaPerBucket){
        if (areaOfWall <= 0 || areaPerBucket <= 0 ){
            return -1;
        }



        return (int) Math.ceil((areaOfWall / areaPerBucket));

    }



}