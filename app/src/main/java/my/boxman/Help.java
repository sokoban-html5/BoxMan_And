package my.boxman;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class Help extends Activity {
	 private static TextView tv_help = null;

	 int m_Num = 0;
	 @Override
	 protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.help);

	    //接收数据
	    Bundle bundle = this.getIntent ().getExtras ();
	    m_Num = bundle.getInt ("m_Num");  //指示调用者是谁

		 //开启标题栏的返回键
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(false);

		tv_help = (TextView)this.findViewById(R.id.tvHelp);

		 StringBuilder s = new StringBuilder();

		 if (m_Num == 1) {  // 推关卡界面调用
		   	 setTitle("操作说明");
			 s.append('\n')
				 .append("【单击--空地】，仓管员移动（需位置可达）；").append('\n')
				 .append("【单击--仓管员】，提示仓管员的可达位置；").append('\n')
				 .append("【单击--仓管员】，提示仓管员的可达位置；").append('\n')
				 .append("【单击--箱子】，提示其可达位置（若此箱子处于“阶梯”造型中，且为“阶梯”中的第一阶，在其可达提示状态，点击“阶梯”中的第二箱子，则会提示“阶梯”走法），再点选可达位置，则自动推箱子到位；").append('\n')
				 .append('\n')
				 .append("【双击--仓管员】，对于某些皮肤，需要手动切换横屏与竖屏，即墙壁或仓管员右旋 90 度；").append('\n')
				 .append("【双击--箱子】，在关闭自动箱子编号状态下，进行人工箱子编号（A--Z，A0--A9～Z0--Z9）；").append('\n')
				 .append("【双击--墙壁、墙外】，全屏与常规模式转换；").append('\n')
				 .append('\n')
				 .append("【长按--墙壁】，正推时，提示没有移动过的箱子和没有用到的地板。例外，在关卡初始状态（移动为步数为 0），显示该关卡的答案信息；逆推时，若“定位双推”开启，则切换是否显示“正逆推双目标点”").append('\n')
				 .append("【长按--非点位上的箱子】，提示可以移动的箱子；").append('\n')
				 .append("【长按--点位上的箱子或点位（需设置开关）】，正推时，提示关联的网点、网口；").append('\n')
				 .append("【长按--空地】，包括逆推时长按点位和正推关闭“长按点位提示关联网”选项时长按点位，提示哪些箱子可以推（拉）到此地，再单击箱子，则自动完成该箱子的推（拉）；").append('\n')
				 .append("【长按--仓管员】，正推时，在关卡初态，为切换是否“自动加载最新状态”，否则，为选择“导出 GIF”开始点（从关卡初态开始时，不需要选择）。逆推时，切换“定位双推”选项开关；").append('\n')
				 .append('\n')
				 .append('\n')
				 .append("【单击--顶行“关卡序号”】，宏调试模式时，结束调试，否则加载并执行宏；").append('\n')
				 .append("【单击--顶行“移动步数”】，“进度条”开关；").append('\n')
				 .append("【单击--顶行“推动步数”】，循环提速；").append('\n')
				 .append("【单击--顶行“游标指示”】，快速更换背景或皮肤；").append('\n')
				 .append("【长按--快速更换背景色】，更改是否“在背景上显示当前时间”开关选项；").append('\n')
				 .append('\n')
				 .append("【长按--顶行“关卡序号”】，“奇偶格模式”开关；").append('\n')
				 .append("【长按--顶行“移动步数”】，“互动双推”模式开关（“互动双推”模式：正逆推互以对方箱子为目标点）；").append('\n')
				 .append("【长按--顶行“推动步数”】，“自动箱子编号”开关；").append('\n')
				 .append("【长按--顶行“游标指示”】，“显示标尺”开关；").append('\n')
				 .append('\n')
				 .append('\n')
				 .append("【长按--底行“后退”按钮】，等于“重新开始”；").append('\n')
				 .append("【长按--底行“前进”按钮】，逆推，等于“进至尾”（正推时，受“演示时仅推动”选项影响）；").append('\n')
				 .append("【长按--底行“旋转”按钮】，等于“0 转”；").append('\n')
				 .append("【长按--底行“更多”按钮】，结束游戏，返回上一层。").append('\n')
				 .append('\n')
				 .append('\n')
				 .append("提醒：全屏推关卡时，“前进”和“后退”两个按钮可以拖动位置。");

		 } else if (m_Num == 2) {  // 创编关卡界面调用
			 setTitle("操作说明");
			 s.append('\n')
				 .append("★顶行：素材、关卡尺寸、箱子数、目标数统计，或标尺、位置等信息；").append('\n')
				 .append('\n')
				 .append("【单击--顶行素材】，素材选取，且自动进入“常规编辑”模式；").append('\n')
				 .append("【长按--顶行素材】，在“块编辑”模式下，可对选区进行填充或勾边；").append('\n')
				 .append("【单击--顶行关卡尺寸】，切换“块编辑”模式与“常规编辑”模式，默认为“块编辑”模式；").append('\n')
				 .append("【长按--顶行关卡尺寸】，以最小选区进行全选，尚未绘制时，选择全部；").append('\n')
				 .append("【长按--“更多”按钮】，结束编辑，返回上一层。").append('\n')
				 .append('\n')
				 .append("★块选模式下：").append('\n')
				 .append("【单击--关卡图】，通过两次点击来确定一个选区（矩形区域），对选区可进行剪切复制（粘贴）、变换、填充等操作；").append('\n')
				 .append("【双击--边界】，关卡尺寸自动增加。").append('\n')
				 .append('\n')
				 .append("★编辑模式下：").append('\n')
				 .append("【单击--关卡图】，绘制；").append('\n')
				 .append("【单指，略延迟滑动--关卡图】，连续绘制。").append('\n')
				 .append('\n')
				 .append("提醒：编辑区中的“区块”可以单独保存，保存后，回到“创编关卡”浏览界面，能够对该“区块”进行相似查找；进行相似查找时，常规关卡是“标准化”后进行比对的，但对“创编关卡”，则不做“标准化”处理；图片识别送入关卡编辑时，会截取图片分作为关卡编辑的参照底图；双击顶部素材行，可以关闭或打开参照底图的显示。");
		 } else if (m_Num == 3) {   // 相似关卡界面调用
			 setTitle("操作说明");
			 s.append('\n')
				 .append("【双击--关卡图】，切换关卡的“全貌”与“标准化”模式，“标准化”模式时，会用红色方框标出“相似区域”。") ;
		 } else if (m_Num == 4) {   // 导入说明
			 setTitle("导入说明");
			 s.append('\n')
				 .append("一、“导入”规范：\n").append('\n')
				 .append("  1、仅正推支持“宏”功能；").append('\n')
				 .append("  2、逆推仅支持常规动作的导入，但是").append('\n')
				 .append("     常规动作前可包含用[x,y]的格式").append('\n')
				 .append("     指示的仓管员的开始坐标；").append('\n')
				 .append("  3、对常规动作（Lurd）进行编辑时，").append('\n')
				 .append("     可以进行旋转、镜像处理，还能进").append('\n')
				 .append("     行寄存（临时保存）等处理；").append('\n')
				 .append("  4、编辑的“宏”指令，不能寄存，但").append('\n')
				 .append("     可以文档形式存取，“宏”文档保").append('\n')
				 .append("     存在专门的“宏/”文件夹中；").append('\n')
				 .append("  5、对于正逆推的常规动作，可以选择").append('\n')
				 .append("     “从当前点”执行，若不勾选，则").append('\n')
				 .append("     表示从关卡的初始状态执行导入的").append('\n')
				 .append("     动作。勾选“按关卡之旋转”与菜").append('\n')
				 .append("     单中的旋转、翻转不是一个概念；").append('\n')
				 .append("  6、逆推动作前，可以不包含仓管员的").append('\n')
				 .append("     坐标，此时，一般是“从当前点”").append('\n')
				 .append("     执行导入的动作。正推动作前，可").append('\n')
				 .append("     包含坐标，此时，将按“宏”来处").append('\n')
				 .append("     理导入。").append('\n').append('\n')
				 .append("二、关于逆推动作中坐标的特别说明：").append('\n').append('\n')
				 .append("  1、逆推动作导入时，会涉及到两个坐").append('\n')
				 .append("     标：⑴是导入动作中的坐标，简称").append('\n')
				 .append("     “导入坐标”，⑵是关卡中仓管员").append('\n')
				 .append("     已有了坐标，简称“关卡坐标”；").append('\n')
				 .append("  2、执行前，若勾选“从当前点”，将").append('\n')
				 .append("     默认使用“关卡坐标”，否则，会").append('\n')
				 .append("     默认使用“导入坐标”；").append('\n')
				 .append("  3、当默认坐标不存在或无效时，会尝").append('\n')
				 .append("     试使用另一种坐标，即尽量执行导").append('\n')
				 .append("     入的动作。当两种坐标都不能使用").append('\n')
				 .append("     时，导入作废；").append('\n')
				 .append("  4、“导入坐标”无效指坐标在墙外或").append('\n')
				 .append("     坐标位置不能放置仓管员。“关卡").append('\n')
				 .append("     坐标”没有无效之说。");
		 } else if (m_Num == 5) {   // 宏功能说明
			 setTitle("“宏”功能说明");
			 s.append('\n')
				 .append("声明：仅正推支持“宏”功能！\n").append('\n')
				 .append("一、“宏”功能使用说明：\n").append('\n')
				 .append("  1、“宏”以文本文档形式，保存在").append('\n')
				 .append("     “推箱快手/宏/”文件夹中；").append('\n')
				 .append("  2、“宏”不支持嵌套；").append('\n')
				 .append("  3、支持行内块（一行多语句）；").append('\n')
				 .append("  4、常规动作（Lurd）可以独占一行，").append('\n')
				 .append("     也可以分行书写；").append('\n')
				 .append("  5、空行将被忽略").append('\n')
				 .append("  6、“宏”符号支持全角半角字符，").append('\n')
				 .append("     请尽量使用英文（半角）字符，").append('\n')
				 .append("     命令中可适当用空格、制表符来").append('\n')
				 .append("     美化布局，“宏”符号包括：").append('\n')
				 .append("     {}、()、[]、<>、+、@、~ 、^、").append('\n')
				 .append("     =、*、?、% 、;、:").append('\n').append('\n')
				 .append("二、“宏”命令详解：").append('\n').append('\n')
				 .append("* => 块循环符号，两种写法：").append('\n')
				 .append("     一是“*n”，即星号后面紧跟一个").append('\n')
				 .append("     数字，标识块循环开始，数字为").append('\n')
				 .append("     循环次数；二是“*”，即星号独占").append('\n')
				 .append("     一行，标识块循环结束。").append('\n')
				 .append("{} => 动作符号").append('\n')
				 .append("     其内为常规动作（Lurd）字符或数").append('\n')
				 .append("     字，若为数字（1--99）会用数字").append('\n')
				 .append("     对应的寄存器（1--9 为内部寄存").append('\n')
				 .append("     器，在导入对话框中对其进行赋值").append('\n')
				 .append("     --动作寄存，而10--99 为玩家自").append('\n')
				 .append("     定义的寄存器，可以使用“宏”指").append('\n')
				 .append("     令对其赋值--现场动作寄存，引用").append('\n')
				 .append("     时，二者同功）中保存的动作串进").append('\n')
				 .append("     行替换，花括号后面可以跟数字，").append('\n')
				 .append("     也可以不跟，数字标识动作重复次").append('\n')
				 .append("     数（0 为无限次），不跟数字时，").append('\n')
				 .append("     默认动作执行一次。动作执行时，").append('\n')
				 .append("     会遇错即停。").append('\n')
				 .append("= => 特别符号，两种用途").append('\n')
				 .append("     1、用于首行首字符，强制“宏”").append('\n')
				 .append("     代码从关卡初态开始执行，否则，").append('\n')
				 .append("     “从当前点”执行，位于其它行时").append('\n')
				 .append("     无此作用，且忽略其后面的字符。").append('\n')
				 .append("     特别注意，执行“宏”时，导入对").append('\n')
				 .append("     话框中的“从当前点”将被忽略；").append('\n')
				 .append("     2、用于花括号后面，表示向寄存器").append('\n')
				 .append("     赋值，寄存器数字允许“10-99”，").append('\n')
				 .append("     等号后面为常规动作字符（Lurd）,").append('\n')
				 .append("     赋值后的引用，可参照前面“动作").append('\n')
				 .append("     符号”中的说明。").append('\n')
				 .append("() => 撤销动作符号").append('\n')
				 .append("     其内为数字，表示撤销的单步数。").append('\n')
				 .append("[] => 走位符号，绝对坐标走位").append('\n')
				 .append("     两种格式，一种是“标尺”格式，").append('\n')
				 .append("     即字母数字格式，一种是逗号分隔").append('\n')
				 .append("     两个数字的格式，先行后列，行列").append('\n')
				 .append("     序号从 0 开始计数。仓管员走位").append('\n')
				 .append("     后，不论是否走位成功，新位置都").append('\n')
				 .append("     会自动记忆，以便下次走位时作为").append('\n')
				 .append("     参照使用。").append('\n')
				 .append("+[] => 走位符号，相对坐标走位").append('\n')
				 .append("     相对于上次记忆的坐标进行走位，").append('\n')
				 .append("     两个坐标做加法，仅支持逗号分隔").append('\n')
				 .append("     两个数字一种格式。格式同上，功").append('\n')
				 .append("     能同上。").append('\n')
				 .append("@[] => 走位符号，相对坐标走位").append('\n')
				 .append("     相对于仓管员当前坐标进行走位，").append('\n')
				 .append("     两个坐标做加法，仅支持逗号分隔").append('\n')
				 .append("     两个数字一种格式。格式同上，功").append('\n')
				 .append("     能同上。").append('\n')
				 .append("~ => 辅助符号，两种用途，").append('\n')
				 .append("     1、跟在“动作”符号（花括号）").append('\n')
				 .append("     后面，表示动作时忽略大小写。该").append('\n')
				 .append("     符号即可以放在重复数字前，也可").append('\n')
				 .append("     以放在重复数字后面；").append('\n')
				 .append("     2、跟在“坐标”符号（方括号）").append('\n')
				 .append("     后面，表示仅记忆坐标，不走位。").append('\n')
				 .append("? => 条件语句符号").append('\n')
				 .append("     格式为：? ① = ② : ③ / ④").append('\n')
				 .append("     其中 ① 为坐标，② 为关卡元素，").append('\n')
				 .append("     ③ 为语句1，④ 为语句2。意思是").append('\n')
				 .append("     当 ②（可多个元素连写）包含关卡").append('\n')
				 .append("     坐标 ① 上的元素时，执行 ③ 处").append('\n')
				 .append("     的语句1，否则执行 ④ 处的语句2").append('\n')
				 .append("     ④ 处的语句2可以省略，① 处的坐").append('\n')
				 .append("     标不记忆、不走位。注意： ③ 和").append('\n')
				 .append("     ④处可以是行内块语句，但是不能").append('\n')
				 .append("     再包含“条件语句”，即条件语句").append('\n')
				 .append("     不支持嵌套。").append('\n')
				 .append("<> => 行内块符号，即一行内多条语句").append('\n')
				 .append("     在尖括号中，书写多条单行“宏”语").append('\n')
				 .append("     句，各语句间用分号隔开即可。特").append('\n')
				 .append("     别的，尖括号后面可以跟数字，也").append('\n')
				 .append("     可以不跟，数字标识动作重复的次").append('\n')
				 .append("     数（参照花括号，但为 0 时，是").append('\n')
				 .append("     执行默认的一次，而非无限次）。").append('\n')
				 .append("% => 跳转符号，即：GoTo 语句").append('\n')
				 .append("     跳转到冒号为首的标记处执行，标").append('\n')
				 .append("     记为非负整数。允许循环块外向循").append('\n')
				 .append("     环块内的跳转，不允许循环块内向").append('\n')
				 .append("     循环块外的跳转。该语句有风险！").append('\n')
				 .append("     特别的：“%*”表示跳出循环块。").append('\n')
				 .append(": => 标记符号").append('\n')
				 .append("     通常与跳转语句（%）配合使用，").append('\n')
				 .append("     冒号后面是一个非负整数，标记要").append('\n')
				 .append("     独占一行。").append('\n')
				 .append("^ => 断点符号，调试符号，独占一行").append('\n')
				 .append("     宏代码执行到此行后，会暂停并转").append('\n')
				 .append("     到单步调试模式。注意，循环块内").append('\n')
				 .append("     的断点符号不起作用。").append('\n')
				 .append("; => 注释符号").append('\n')
				 .append("     执行“宏”时，会忽略分号（;）后").append('\n')
				 .append("     面的内容，可独占一行，也可放在").append('\n')
				 .append("     “宏”语句的后面。");
		 } else if (m_Num == 6) {   // 图片识别说明
			 setTitle("操作说明");
			 s.append('\n')
				 .append("  图像识别，是利用关卡截图，自动识别出其 XSB，属于创编关卡的辅助功能。\n").append('\n')
				 .append("一般步骤：\n").append('\n')
				 .append("  1、边框定位：").append('\n')
				 .append("     边框线上带有圆形“指示灯”，粉红色为“点亮”状态，表示该边线被选中，长按可以“点亮”（当没有选择底行的 XSB 元素时，也可以单击“点亮”）。底行的“上下左右”按钮对被选中的边线进行微调定位，也可以在“指示灯”附近双击进行微调；“长按”指示灯（此时，指示灯会闪烁）可以直接拖动当前边线；边框线采用了“黑白”双色线条，对位的最佳效果是以白线“压边”。").append('\n')
				 .append("  2、确定横向格子数：").append('\n')
				 .append("     当边框确定好后，就可以利用顶行的“增”、“减”按钮调整关卡横向的格子数，而纵向格子数会自动计算。").append('\n')
				 .append("  3、识别：").append('\n')
				 .append("     当格线调整好之后，先点选底行的 XSB“元素”，然后点击图片中的相应格子，快手会自动启动“识别”。").append('\n')
				 .append("  4、识别设置：").append('\n')
				 .append("     当识别效果不理想时，可以通过顶行的“度”按钮，调整识别“相似度”，会有一定程度的改善。").append('\n')
				 .append("  5、编辑：").append('\n')
				 .append("     对于少量的关卡元素，也可以直接手动编辑而不做自动识别。通过点击顶行的“识别”或“编辑”菜单项进行模式切换。在“编辑”模式下，先点选底行的 XSB“元素”，然后点击“格子”即可。特别的，长按底行的 XSB“元素”，会有更多功能，具体不做详述。");
		 } else {    // 主界面调用
			 s.append("====== 特别提醒 ======").append('\n')
				 .append('\n')
				 .append("  在重要“节点”请及时做好关卡库（DataBase/Boxman.db）的备份，尤其在每次升级“快手”、或在做较多较大关卡集导入的之前，以防不测！！！").append('\n')
				 .append('\n')
				 .append("===== 下载与交流 =====").append('\n')
				 .append('\n')
				 .append("网站：sokoban.cn").append('\n')
				 .append("QQ群：92017135").append('\n')
				 .append('\n')
				 .append("======== 简介 ========").append('\n')
				 .append('\n')
				 .append("  1、“快手”中，关卡、答案采用(XSB+Lurd)标准格式，关卡（集）文档的扩展名支持“XSB、TXT、SOK、TXZ”等）；").append('\n')
				 .append("  2、“快手”使用 SQLite 数据库管理关卡和答案数据，简称“关卡库”，关卡库及“快手”的其他数据均放置在手机内存卡的“/storage/emulated/0/推箱快手/”下，“DataBase/BoxMan.db”即为关卡库，关卡库中的数据不可手动修改，否则可能导致 APP 崩溃！但可以删除或改名（文件夹或关卡库），删除或改名后，关卡库（“快手”自带的原始数据）会自动生成；").append('\n')
				 .append("  3、“快手”支持自设皮肤，玩家可将自定义皮肤（PNG 图片）文档复制到“皮肤/”下，然后在 APP 里设置更换皮肤即可，“defskin.png”为默认皮肤（尺寸为 200 x 400，此文件可以删除，删除后会自动生成）为“快手”自带的默认皮肤，玩家可以参照其格式自己绘制，注意部分元素使用了透明背景。另外，“快手”还支持简版皮肤（200 x 350，仅含两个方向的仓管员图元）和超简皮肤（200 x 150，仅含一个墙体及两个方向的仓管员图元）；").append('\n')
				 .append("  4、“快手”支持关卡扩展，通常称为“导入”，导入有单关卡的导入；有文档方式的导入，有剪切板方式的导入；还可以通过关卡编辑中的提交导入。在某些导入方式中，还可同时导入关卡答案以及批量导入；").append('\n')
				 .append("  5、导入关卡集，需先将关卡集文档复制到“导入/”下，然后在首界面的菜单中，选择“导入...”即可；").append('\n')
				 .append("  6、对于导入、通过 YASS 得到或优化的答案，快手会自动将“[导入]”或“[YASS]”记入该答案的“备注”中；").append('\n')
				 .append("  7、“快手”支持“状态”与“答案”保存和导出，导出的文档，均放在“导出/”文件夹下；").append('\n')
				 .append("  8、关卡的扩展和删除，只针对玩家自己扩展的关卡，即：“关卡扩展”分组；").append('\n')
				 .append("  9、快手编辑功能中，导入支持关卡 XSB 导入，同时支持 Lurd 导入（即：通过答案 Lurd 倒推出关卡 XSB）。另外，快手还支持关卡图的自动识别，玩家可以先将关卡截图复制到“关卡图/”文件夹中，然后，通过关卡编辑功能中的“图像识别”，自动识别出关卡 XSB；").append('\n')
				 .append("  10、“快手”支持的关卡尺寸为：3--100行、3--100列，对尺寸超标或不足、箱子与目标不符、仓管员数目非法的，均视为无效关卡且不予接收，用灰色预览图标示占位；").append('\n')
				 .append("  11、“快手”支持答案（或动作）合成 GIF 动画，其中：“现场皮肤”动画，可以将名称为“banner.png”图片放到“推箱快手/”一级文件夹下（建议尺寸控制在“200  x 42”以内，且需在快手启动前放置才有效），作为自定义动画水印，默认水印为“sokoban.cn”网站域名，“现场皮肤”动画同时支持人工箱子编号和标尺，以便教学；而“固定皮肤”，默认水印为“推箱子群”的QQ号码，自定义水印，自动取提交比赛答案的玩家“姓名”。").append('\n')
				 .append('\n')
				 .append("====== 最近更新 ======").append('\n')
				 .append('\n')
				 .append("BoxMan9.99f：2020-07-19").append('\n')
				 .append("1、将“逆推时使用正推目标点”模式命名为“定位双推”模式。").append('\n')
				 .append('\n')
				 .append("BoxMan9.99e：2020-06-05").append('\n')
				 .append("1、修正“背景时间定时器”延迟时间过小可能引发的闪退问题（老夫子）。").append('\n')
				 .append('\n')
				 .append("BoxMan9.99d：2020-06-04").append('\n')
				 .append("1、修正长按关卡集标题的“详细”中关卡数字统计错误的Bug（小珏）;").append('\n')
				 .append("2、增加对自动保存导入答案的支持（但是，有时保存提示不能正常显示出来）；").append('\n')
				 .append("3、游戏时，允许背景上显示当前时间；").append('\n')
				 .append("4、修正创建先关卡集时，误判命名合法性的Bug（守望pj）；").append('\n')
				 .append("5、将“即景”模式重新命名为“互动双推”模式（anian版主）。").append('\n')
				 .append('\n')
				 .append("BoxMan9.98：2019-11-22").append('\n')
                 .append("1、修正导入逆推动作时偶尔闪退的Bug；").append('\n')
                 .append("2、加载比赛的关卡和答案列表时，增加对第二副关的支持。").append('\n')
				 .append('\n')
				 .append("BoxMan9.97：2019-10-17").append('\n')
				 .append("1、优化“互动双推”模式；").append('\n')
				 .append("2、完善比赛答案提交功能（anian版主）；").append('\n')
                 .append("3、优化关卡截图文档列表按创建时间排序，把最新的列在最前面（anian版主）；").append('\n')
				 .append("4、修正个别手机上，状态栏和菜单字体不清晰问题（Xiao Fei xia、不愿透露姓名）；").append('\n')
                 .append("5、更新逆推中的仓管员坐标[0, 0]为起点到[1, 1]为起点（anian版主）；").append('\n')
                 .append("6、修正关卡浏览界面处于“显示标题”模式下，长按关卡的“移动到...”功能有时不能正确执行的bug（anian版主）；").append('\n')
				 .append("7、修正逆推动作导入时，偶尔出现多个仓管员的bug；").append('\n')
				 .append("8、其它优化。").append('\n')
				 .append('\n')
				 .append("BoxMan9.96：2019-6-29").append('\n')
				 .append("1、增加关卡图默认的最大缩放倍数（关雎）；").append('\n')
				 .append("2、修复“对角死锁”检测时偶尔误报的bug（天）；").append('\n')
				 .append("3、其它优化。").append('\n')
				 .append('\n')
				 .append("BoxMan9.95：2019-4-26").append('\n')
				 .append("1、新增导入往期比赛关卡功能（无极）；").append('\n')
				 .append("2、新增奇偶位地板格显示功能，并为其增设开关选项，更改“死锁嗅探”开关快键（长按顶行关卡序号）为“奇偶格位显示”开关快键，同时，允许玩家在“设置”中对奇偶格的明暗度进行调整（云淡风清、cjcjcj）；").append('\n')
				 .append("3、修复编辑关卡时，最右边一列的箱子和目标点统计不到的bug；").append('\n')
				 .append("4、优化状态保存功能（状态重复时，仅更新一下时间，以确保下次排到最前面）；").append('\n')
				 .append("5、修复“对角死锁”检测时偶尔误报的bug（棉花糖ONE）；").append('\n')
				 .append("6、修复使用简单皮肤时，重复关卡详细资料中关卡图显示不完整的bug（没有箱子、目标点和人）；").append('\n')
				 .append("7、其它优化。").append('\n')
				 .append('\n')
				 .append("BoxMan9.94：2019-3-29").append('\n')
				 .append("1、答案列表加入“时间优先”排序，时间相同时“移动优先”（不愿透露姓名）；").append('\n')
				 .append("2、创编关卡的“块选模式”下，双击边界，关卡尺寸自动增加（anian版主）；").append('\n')
				 .append("3、进一步完善识别中的编辑功能；").append('\n')
				 .append("4、简单优化“帮助”功能；").append('\n')
				 .append("5、导出时的 GIF 同时支持“自动箱子编号”和“人工箱子编号”（anian版主）；").append('\n')
				 .append("6、优化图像识别中的自定义图片位置功能（anian版主）；").append('\n')
				 .append("7、通过改变“标尺”提示框中文字的颜色，提示其可能的“半位”的奇偶性（20603大师）；").append('\n')
				 .append("8、其它优化。").append('\n')
				 .append('\n')
				 .append("BoxMan9.93：2019-3-1").append('\n')
				 .append("1、关卡图像的自动识别换用艾嘉发现的新算法，效率提升巨大；识别模块包含两种工作模式，即：“识别”模式和“编辑”模式；识别完成后送入“关卡编辑”时，会截取图片作为编辑参照（编辑中，可双击顶行关闭或开启参照图）；边框和格子大小的调整方式变动较大，底行的“微调”按钮增加长按操作等（爱伽斯顿、anian版主）；").append('\n')
				 .append("2、关卡的答案列表增加“移动优先”或“推动优先”重排功能（每次打开时默认“移动优先”，长按切换）；").append('\n')
				 .append("3、由于未解关卡在打开时会自动打开并定位到上次保存的状态，所以增设“自动加载最新状态”临时开关选项（先回到关卡初态，再“长按”仓管员），以避免相似关卡无法用切换法比对的问题；").append('\n')
				 .append("4、改用“GBK”编码提交比赛答案（微风中的歌声）；").append('\n')
				 .append("5、进一步完善“闭口对角”死锁嗅探功能；").append('\n')
				 .append("6、其它优化。").append('\n')
				 .append('\n')
				 .append("BoxMan9.92：2019-1-29").append('\n')
				 .append("1、优化相似关卡搜索功能（anian版主）；").append('\n')
				 .append("2、优化关卡图像的自动识别功能；").append('\n')
				 .append("3、修正文档导入中“GBK”编码被提示为“UTF-8”的错误（不愿透露姓名）；").append('\n')
				 .append("4、修复创编关卡没有保存时，呼叫关卡资料和尝试试推闪退的bug（不愿透露姓名）；").append('\n')
				 .append("5、修复对角死锁检测的一处bug（黑龙江毕景鹏）。").append('\n')
				 .append('\n')
				 .append("BoxMan9.91：2019-1-25").append('\n')
				 .append("1、优化“冻结”（原“方型”和“之字型”）死锁检测代码，创建独立类；").append('\n')
				 .append("2、优化“闭锁对角”死锁检测代码；").append('\n')
				 .append("3、优化关卡浏览功能，同时，此处增设“添加关卡”、“导出”、改变“每行图标个数”等功能（麦英、爱伽斯顿）；").append('\n')
				 .append("4、优化“创编关卡”的尺寸设定和修改功能（爱伽斯顿）；").append('\n')
				 .append("5、优化关卡解析功能：解析时，忽略（直接舍弃，不再视作无效关卡记录到备注中）行数小于 3 或者列数小于 3 的关卡；对于连续的“标题”、“作者”等信息，只解析第一个；对于超尺寸关卡，视作无效关卡，并将其记录到备注中，同时，其标题强制为“无效关卡”，以便查询；在保留关卡外围造型的前提下，自动做关卡的“瘦化”处理（去除关卡外围无用的“空白”）（麦英、爱伽斯顿、anian版主）；").append('\n')
				 .append("6、首界面、关卡浏览界面，增加“详细...”菜单项，显示关卡集或关卡的说明信息等（爱伽斯顿）;").append('\n')
				 .append("7、修正逆推中“点位不足”死锁检测的bug（爱伽斯顿）；").append('\n')
				 .append("8、修正关卡浏览界面关卡不能正确复制的bug（麦英）；").append('\n')
				 .append("9、新建关卡集时，快手会为玩家推荐一个名称；移动、复制、提交关卡时，在关卡集列表的末尾，快手也会推荐一个新建的关卡集备用（爱伽斯顿、anian版主）；").append('\n')
				 .append("10、推关卡时，对于导入的常规动作（不包含任何“宏”命令），自动忽略大小写执行（20603、anian版主）；").append('\n')
				 .append("11、打开关卡时，若有答案，自动加载答案；否则，若有状态，自动加载到最新状态（爱伽斯顿）；").append('\n')
				 .append("12、强制用墙壁替换关卡外围造型中的箱子，即只允许使用墙壁做造型；").append('\n')
				 .append("13、强制 BoxWorld 关卡集的第一个关卡至少保留 1 个答案（DB原因，答案表中若无记录，可能会发生不可预知的bug）；").append('\n')
				 .append("14、导入导出时，使用“导入/”、“导出/”文件夹，不再使用“关卡扩展/”文件夹；对于超长无法写入DB的答案，将以文档形式写入“超长答案/”文件夹").append('\n')
				 .append("15、比赛答案提交列表、关卡浏览菜单等其它方面的优化；").append('\n')
				 .append("16、导入文档关卡时，增加“GBK”编码选项（小珏）；").append('\n')
				 .append("17、增加关卡图的自动识别功能（爱伽斯顿、anian版主）。").append('\n')
				 .append('\n')
				 .append("BoxMan9.90：2018-12-24").append('\n')
				 .append("1、优化最后一步的“撤销”功能；").append('\n')
				 .append("2、完善死锁检测功能，以移植 JSoko 的“闭锁对角”（原“双 L”型）死锁检测为主，创建独立类；").append('\n')
				 .append("3、将探路算法中的 parent 等变量由原来的 byte[][] 类型改变为 short[][] 类型，已修复因穿越深度过大时，超过 byte 类型最大值的 bug。");
		 }

		 tv_help.setText(s.toString());
	 }
	 
	 @Override
	 public boolean onOptionsItemSelected(MenuItem item) {
		 switch (item.getItemId()) {
		 //返回键
		 case android.R.id.home:
			this.finish();
			return true;
		 default:
			return super.onOptionsItemSelected(item);
		 }
	 }
		
	 @Override    
	 protected void onDestroy() { 
		 setContentView(R.layout.main);
		 super.onDestroy();
	 }

}
