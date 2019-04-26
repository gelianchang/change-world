// 需求：
	// 	判断当前天气  当外面天气下雨的时候带伞，男的话带一把大黑伞，女的话带尾巴小花伞，
	// 	当外面晴天的时候，温度30度以上，男的带墨镜，女的防嗮霜
	// 提示： 一定会用到嵌套，当天起状况 温度性别都是需要从键盘输入
public class WeatherIf{
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("欢迎使用本系统，可以通过本系统来做一些简单的判断");
		System.out.println("1表示男，0表示女");
		System.out.println("说明：1表示下雨，0表示晴天");
		System.out.println("温度为数字");
		System.out.print("请输入性别：");
		int sex = s.nextInt();
		System.out.print("请输入当前天气：");
		int weather = s.nextInt();
		//输入天气状况	
		if (weather == 1) {
			//下雨
			System.out.println("下雨天喔");
			if (sex==1){
				System.out.println("带一个大黑伞");
			}else if (sex == 0){
				System.out.println("带一把小花伞");
			}
		}else if (weather == 0){
			System.out.print("输入当天温度：");
			int temp = s.nextInt();
			if (temp<0 || temp>45 ) { //判读温度是否合法
				System.out.println("温度有问题");
			}else if (temp>30) {
				if (sex==1) {
					System.out.println("墨镜戴起来真酷");					
				}else if (sex == 0) {
					System.out.println("记得抹防嗮霜");
					
				}
				
			}else{
				System.out.println("凉快");
			}

		}


	}
}