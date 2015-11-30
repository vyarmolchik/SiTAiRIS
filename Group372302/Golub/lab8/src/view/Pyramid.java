package view;


public class Pyramid{
    public Float countVolume (float width, float height){
        return 1.0f / 3.0f * height * width * width;
    }
    public Float countArea (float width, float height){
        return 1.0f / 2.0f * height * width;
    }
}
