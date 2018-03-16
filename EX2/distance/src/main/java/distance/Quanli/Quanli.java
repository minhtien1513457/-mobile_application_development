package distance.Quanli;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Quanli {
			public static double distanceBetween2Points(double la1, double lo1, double la2, double lo2) {
				   double tmp1 = (la2 - la1) * (Math.PI / 180);
				   double tmp2 = (lo2 - lo1) * (Math.PI / 180);
				   double tmp3 = la1 * (Math.PI / 180);
				   double tmp4 = la2 * (Math.PI / 180);
				   double tmp5 = Math.sin(tmp1 / 2) * Math.sin(tmp1 / 2) + Math.cos(tmp3)
				   * Math.cos(tmp4) * Math.sin(tmp2 / 2) * Math.sin(tmp2 / 2);
				   double tmp6 = 2 * Math.atan2(Math.sqrt(tmp5), Math.sqrt(1 - tmp5));
				   double tmp7 = 6371 * tmp6;
				   return tmp7;
	}
	@RequestMapping(value = "/{xxANDxx}")           
    @ResponseBody
    public String getDistance(@PathVariable("xxANDxx") String xxANDxx) {
		String[] x=xxANDxx.split("AND");
		String[] t1=x[0].split(".");
		String[] t2=x[1].split(".");
		Double x1=Double.parseDouble(t1[0]);
		Double y1=Double.parseDouble(t1[1]);
		Double x2=Double.parseDouble(t2[0]);
		Double y2=Double.parseDouble(t2[1]);
		System.out.println("result between point1 and point2: " + x1);
        return Double.toString(distanceBetween2Points(x1,y1,x2,y2));
		//return xxTOxx;
    }

}
