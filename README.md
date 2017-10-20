# ImageViewScaleTypeTest
ImageView ScaleType Test

matrix:
图片按真实效果显示，不进行拉伸或者压缩，
图片小于ImageView是，从左上角开始显示全部图片，
图片大于ImageView时，从左上角显示，将超出ImageView的部分裁剪掉显示。

fitXY:
以填充ImageView为目的，
图片根据ImageView的宽高进行压缩或者拉伸显示。

fitStart
图片的大小按照ImageView的宽或者高进行拉伸或者压缩，
直到有其中一边与ImageView的宽高相同。
显示位置居于左或者上显示,
如果ImageView的宽高为正方形，图片的宽高也为正方形，则进行拉伸或者压缩填充。
    
fitCenter
图片的大小显示与FitStart一致，
显示位置为中间，
因为是根据ImageView的宽或者高进行拉伸或者压缩，
因此显示的位置只能是水平居中或者垂直居中。
    
fitEnd
图片的大小显示与FitStart一致,
显示位置为结尾,
根据ImageView的长宽和图片的长宽对比。
    
center
居中显示，图片不进行拉伸或者压缩
如果图片大小小于ImageView，居中显示
如果大于，则只显示图片中间的部分，将其他区域进行裁剪掉

centerCrop
目的填充满ImageView，
图片根据ImageView的宽和高进行拉伸或者压缩，
直到其中的长或者宽达到ImageView的长或者宽的最大值，
等比例显示，然后将其余部分裁剪掉。

centerInside
目的将图片完全显示出来，
按比例缩放原图，直到图片可以完全显示出来，
并居于中间显示，
如果图片小于ImageView则居中显示原图。
