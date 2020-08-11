package com.example.ahp;

import android.R.string;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class A1Activity extends Activity {

	private RadioButton r11;
	private RadioButton r12;
	private RadioButton r13;
	private RadioButton r14;
	private RadioButton r15;
	private RadioButton r16;
	private RadioButton r17;
	
	private RadioButton r21;
	private RadioButton r22;
	private RadioButton r23;
	private RadioButton r24;
	private RadioButton r25;
	private RadioButton r26;
	private RadioButton r27;
	
	private RadioButton r31;
	private RadioButton r32;
	private RadioButton r33;
	private RadioButton r34;
	private RadioButton r35;
	private RadioButton r36;
	private RadioButton r37;
	
	private RadioButton r41;
	private RadioButton r42;
	private RadioButton r43;
	private RadioButton r44;
	private RadioButton r45;
	private RadioButton r46;
	private RadioButton r47;
	
	private RadioButton r51;
	private RadioButton r52;
	private RadioButton r53;
	private RadioButton r54;
	private RadioButton r55;
	private RadioButton r56;
	private RadioButton r57;
	
	private RadioButton r61;
	private RadioButton r62;
	private RadioButton r63;
	private RadioButton r64;
	private RadioButton r65;
	private RadioButton r66;
	private RadioButton r67;
	
	private RadioButton r311;
	private RadioButton r312;
	private RadioButton r313;
	private RadioButton r314;
	private RadioButton r315;
	private RadioButton r316;
	private RadioButton r317;
	
	private RadioButton r321;
	private RadioButton r322;
	private RadioButton r323;
	private RadioButton r324;
	private RadioButton r325;
	private RadioButton r326;
	private RadioButton r327;
	
	private RadioButton r331;
	private RadioButton r332;
	private RadioButton r333;
	private RadioButton r334;
	private RadioButton r335;
	private RadioButton r336;
	private RadioButton r337;
	
	private RadioButton r341;
	private RadioButton r342;
	private RadioButton r343;
	private RadioButton r344;
	private RadioButton r345;
	private RadioButton r346;
	private RadioButton r347;
	
	private RadioButton r351;
	private RadioButton r352;
	private RadioButton r353;
	private RadioButton r354;
	private RadioButton r355;
	private RadioButton r356;
	private RadioButton r357;
	
	private RadioButton r361;
	private RadioButton r362;
	private RadioButton r363;
	private RadioButton r364;
	private RadioButton r365;
	private RadioButton r366;
	private RadioButton r367;

	private RadioButton r211;
	private RadioButton r212;
	private RadioButton r213;
	private RadioButton r214;
	private RadioButton r215;
	private RadioButton r216;
	private RadioButton r217;
	
	private RadioButton r221;
	private RadioButton r222;
	private RadioButton r223;
	private RadioButton r224;
	private RadioButton r225;
	private RadioButton r226;
	private RadioButton r227;
	
	private RadioButton r231;
	private RadioButton r232;
	private RadioButton r233;
	private RadioButton r234;
	private RadioButton r235;
	private RadioButton r236;
	private RadioButton r237;
	
	private RadioButton r241;
	private RadioButton r242;
	private RadioButton r243;
	private RadioButton r244;
	private RadioButton r245;
	private RadioButton r246;
	private RadioButton r247;
	
	private RadioButton r251;
	private RadioButton r252;
	private RadioButton r253;
	private RadioButton r254;
	private RadioButton r255;
	private RadioButton r256;
	private RadioButton r257;
	
	private RadioButton r261;
	private RadioButton r262;
	private RadioButton r263;
	private RadioButton r264;
	private RadioButton r265;
	private RadioButton r266;
	private RadioButton r267;
	
	private RadioButton r411;
	private RadioButton r412;
	private RadioButton r413;
	private RadioButton r414;
	private RadioButton r415;
	private RadioButton r416;
	private RadioButton r417;
	
	private RadioButton r421;
	private RadioButton r422;
	private RadioButton r423;
	private RadioButton r424;
	private RadioButton r425;
	private RadioButton r426;
	private RadioButton r427;
	
	private RadioButton r431;
	private RadioButton r432;
	private RadioButton r433;
	private RadioButton r434;
	private RadioButton r435;
	private RadioButton r436;
	private RadioButton r437;
	
	private RadioButton r441;
	private RadioButton r442;
	private RadioButton r443;
	private RadioButton r444;
	private RadioButton r445;
	private RadioButton r446;
	private RadioButton r447;

	private RadioButton r451;
	private RadioButton r452;
	private RadioButton r453;
	private RadioButton r454;
	private RadioButton r455;
	private RadioButton r456;
	private RadioButton r457;
	
	private RadioButton r461;
	private RadioButton r462;
	private RadioButton r463;
	private RadioButton r464;
	private RadioButton r465;
	private RadioButton r466;
	private RadioButton r467;
    
	private RadioButton r511;
	private RadioButton r512;
	private RadioButton r513;
	private RadioButton r514;
	private RadioButton r515;
	private RadioButton r516;
	private RadioButton r517;
	
	private RadioButton r521;
	private RadioButton r522;
	private RadioButton r523;
	private RadioButton r524;
	private RadioButton r525;
	private RadioButton r526;
	private RadioButton r527;

	private RadioButton r531;
	private RadioButton r532;
	private RadioButton r533;
	private RadioButton r534;
	private RadioButton r535;
	private RadioButton r536;
	private RadioButton r537;
	
	private RadioButton r541;
	private RadioButton r542;
	private RadioButton r543;
	private RadioButton r544;
	private RadioButton r545;
	private RadioButton r546;
	private RadioButton r547;

	private RadioButton r551;
	private RadioButton r552;
	private RadioButton r553;
	private RadioButton r554;
	private RadioButton r555;
	private RadioButton r556;
	private RadioButton r557;
	
	private RadioButton r561;
	private RadioButton r562;
	private RadioButton r563;
	private RadioButton r564;
	private RadioButton r565;
	private RadioButton r566;
	private RadioButton r567;
	
	private TextView t7;
	private TextView t8;
	private TextView t9;
	private TextView t10;
	
	private TextView t12;
	private TextView t13;
	private TextView t14;
	private TextView t15;
	
	private TextView t17;
	private TextView t18;
	private TextView t19;
	private TextView t20;
	
	private TextView t22;
	private TextView t23;
	private TextView t24;
	private TextView t25;
	
	private TextView t27;
	private TextView t28;
	private TextView t29;
	private TextView t30;
	
	private TextView t31;
	private Button jixu;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_a1);
		
		jixu = (Button)findViewById(R.id.button1);
		
		t7 = (TextView)findViewById(R.id.textView7);
		t8 = (TextView)findViewById(R.id.textView8);
		t9 = (TextView)findViewById(R.id.textView9);
		t10 = (TextView)findViewById(R.id.textView10);
		
		t12 = (TextView)findViewById(R.id.textView12);
		t13 = (TextView)findViewById(R.id.textView13);
		t14 = (TextView)findViewById(R.id.textView14);
		t15 = (TextView)findViewById(R.id.textView15);
		
		t17 = (TextView)findViewById(R.id.textView17);
		t18 = (TextView)findViewById(R.id.textView18);
		t19 = (TextView)findViewById(R.id.textView19);
		t20 = (TextView)findViewById(R.id.textView20);
		
		t22 = (TextView)findViewById(R.id.textView22);
		t23 = (TextView)findViewById(R.id.textView23);
		t24 = (TextView)findViewById(R.id.textView24);
		t25 = (TextView)findViewById(R.id.textView25);
		
		t27 = (TextView)findViewById(R.id.textView27);
		t28 = (TextView)findViewById(R.id.textView28);
		t29 = (TextView)findViewById(R.id.textView29);
		t30 = (TextView)findViewById(R.id.textView30);
		
		t31 = (TextView)findViewById(R.id.textView31);
		
		r11 = (RadioButton)findViewById(R.id.radio11);
		r12 = (RadioButton)findViewById(R.id.radio12);
		r13 = (RadioButton)findViewById(R.id.radio13);
		r14 = (RadioButton)findViewById(R.id.radioButton14);
		r15 = (RadioButton)findViewById(R.id.radioButton15);
		r16 = (RadioButton)findViewById(R.id.radioButton16);
		r17 = (RadioButton)findViewById(R.id.radioButton17);
	
		r21 = (RadioButton)findViewById(R.id.radio21);
		r22 = (RadioButton)findViewById(R.id.radio22);
		r23 = (RadioButton)findViewById(R.id.radio23);
		r24 = (RadioButton)findViewById(R.id.radioButton24);
		r25 = (RadioButton)findViewById(R.id.radioButton25);
		r26 = (RadioButton)findViewById(R.id.radioButton26);
		r27 = (RadioButton)findViewById(R.id.radioButton27);
	
		r31 = (RadioButton)findViewById(R.id.radio31);
		r32 = (RadioButton)findViewById(R.id.radio32);
		r33 = (RadioButton)findViewById(R.id.radio33);
		r34 = (RadioButton)findViewById(R.id.radioButton34);
		r35 = (RadioButton)findViewById(R.id.radioButton35);
		r36 = (RadioButton)findViewById(R.id.radioButton36);
		r37 = (RadioButton)findViewById(R.id.radioButton37);
	
		r41 = (RadioButton)findViewById(R.id.radio41);
		r42 = (RadioButton)findViewById(R.id.radio42);
		r43 = (RadioButton)findViewById(R.id.radio43);
		r44 = (RadioButton)findViewById(R.id.radioButton44);
		r45 = (RadioButton)findViewById(R.id.radioButton45);
		r46 = (RadioButton)findViewById(R.id.radioButton46);
		r47 = (RadioButton)findViewById(R.id.radioButton47);

		r51 = (RadioButton)findViewById(R.id.radio51);
		r52 = (RadioButton)findViewById(R.id.radio52);
		r53 = (RadioButton)findViewById(R.id.radio53);
		r54 = (RadioButton)findViewById(R.id.radioButton54);
		r55 = (RadioButton)findViewById(R.id.radioButton55);
		r56 = (RadioButton)findViewById(R.id.radioButton56);
		r57 = (RadioButton)findViewById(R.id.radioButton57);
	
		r61 = (RadioButton)findViewById(R.id.radio61);
		r62 = (RadioButton)findViewById(R.id.radio62);
		r63 = (RadioButton)findViewById(R.id.radio63);
		r64 = (RadioButton)findViewById(R.id.radioButton64);
		r65 = (RadioButton)findViewById(R.id.radioButton65);
		r66 = (RadioButton)findViewById(R.id.radioButton66);
		r67 = (RadioButton)findViewById(R.id.radioButton67);
	
		r211 = (RadioButton)findViewById(R.id.radio211);
		r212 = (RadioButton)findViewById(R.id.radio212);
		r213 = (RadioButton)findViewById(R.id.radio213);
		r214 = (RadioButton)findViewById(R.id.radioButton214);
		r215 = (RadioButton)findViewById(R.id.radioButton215);
		r216 = (RadioButton)findViewById(R.id.radioButton216);
		r217 = (RadioButton)findViewById(R.id.radioButton217);

		r221 = (RadioButton)findViewById(R.id.radio221);
		r222 = (RadioButton)findViewById(R.id.radio222);
		r223 = (RadioButton)findViewById(R.id.radio223);
		r224 = (RadioButton)findViewById(R.id.radioButton224);
		r225 = (RadioButton)findViewById(R.id.radioButton225);
		r226 = (RadioButton)findViewById(R.id.radioButton226);
		r227 = (RadioButton)findViewById(R.id.radioButton227);
	
		r231 = (RadioButton)findViewById(R.id.radio231);
		r232 = (RadioButton)findViewById(R.id.radio232);
		r233 = (RadioButton)findViewById(R.id.radio233);
		r234 = (RadioButton)findViewById(R.id.radioButton234);
		r235 = (RadioButton)findViewById(R.id.radioButton235);
		r236 = (RadioButton)findViewById(R.id.radioButton236);
		r237 = (RadioButton)findViewById(R.id.radioButton237);

		r241 = (RadioButton)findViewById(R.id.radio241);
		r242 = (RadioButton)findViewById(R.id.radio242);
		r243 = (RadioButton)findViewById(R.id.radio243);
		r244 = (RadioButton)findViewById(R.id.radioButton244);
		r245 = (RadioButton)findViewById(R.id.radioButton245);
		r246 = (RadioButton)findViewById(R.id.radioButton246);
		r247 = (RadioButton)findViewById(R.id.radioButton247);
	
		r251 = (RadioButton)findViewById(R.id.radio251);
		r252 = (RadioButton)findViewById(R.id.radio252);
		r253 = (RadioButton)findViewById(R.id.radio253);
		r254 = (RadioButton)findViewById(R.id.radioButton254);
		r255 = (RadioButton)findViewById(R.id.radioButton255);
		r256 = (RadioButton)findViewById(R.id.radioButton256);
		r257 = (RadioButton)findViewById(R.id.radioButton257);

		r261 = (RadioButton)findViewById(R.id.radio261);
		r262 = (RadioButton)findViewById(R.id.radio262);
		r263 = (RadioButton)findViewById(R.id.radio263);
		r264 = (RadioButton)findViewById(R.id.radioButton264);
		r265 = (RadioButton)findViewById(R.id.radioButton265);
		r266 = (RadioButton)findViewById(R.id.radioButton266);
		r267 = (RadioButton)findViewById(R.id.radioButton267);
		
		
		r311 = (RadioButton)findViewById(R.id.radio311);
		r312 = (RadioButton)findViewById(R.id.radio312);
		r313 = (RadioButton)findViewById(R.id.radio313);
		r314 = (RadioButton)findViewById(R.id.radioButton314);
		r315 = (RadioButton)findViewById(R.id.radioButton315);
		r316 = (RadioButton)findViewById(R.id.radioButton316);
		r317 = (RadioButton)findViewById(R.id.radioButton317);
	
		r321 = (RadioButton)findViewById(R.id.radio321);
		r322 = (RadioButton)findViewById(R.id.radio322);
		r323 = (RadioButton)findViewById(R.id.radio323);
		r324 = (RadioButton)findViewById(R.id.radioButton324);
		r325 = (RadioButton)findViewById(R.id.radioButton325);
		r326 = (RadioButton)findViewById(R.id.radioButton326);
		r327 = (RadioButton)findViewById(R.id.radioButton327);
	
		r331 = (RadioButton)findViewById(R.id.radio331);
		r332 = (RadioButton)findViewById(R.id.radio332);
		r333 = (RadioButton)findViewById(R.id.radio333);
		r334 = (RadioButton)findViewById(R.id.radioButton334);
		r335 = (RadioButton)findViewById(R.id.radioButton335);
		r336 = (RadioButton)findViewById(R.id.radioButton336);
		r337 = (RadioButton)findViewById(R.id.radioButton337);
	
		r341 = (RadioButton)findViewById(R.id.radio341);
		r342 = (RadioButton)findViewById(R.id.radio342);
		r343 = (RadioButton)findViewById(R.id.radio343);
		r344 = (RadioButton)findViewById(R.id.radioButton344);
		r345 = (RadioButton)findViewById(R.id.radioButton345);
		r346 = (RadioButton)findViewById(R.id.radioButton346);
		r347 = (RadioButton)findViewById(R.id.radioButton347);
		
		r351 = (RadioButton)findViewById(R.id.radio351);
		r352 = (RadioButton)findViewById(R.id.radio352);
		r353 = (RadioButton)findViewById(R.id.radio353);
		r354 = (RadioButton)findViewById(R.id.radioButton354);
		r355 = (RadioButton)findViewById(R.id.radioButton355);
		r356 = (RadioButton)findViewById(R.id.radioButton356);
		r357 = (RadioButton)findViewById(R.id.radioButton357);
	
		r361 = (RadioButton)findViewById(R.id.radio361);
		r362 = (RadioButton)findViewById(R.id.radio362);
		r363 = (RadioButton)findViewById(R.id.radio363);
		r364 = (RadioButton)findViewById(R.id.radioButton364);
		r365 = (RadioButton)findViewById(R.id.radioButton365);
		r366 = (RadioButton)findViewById(R.id.radioButton366);
		r367 = (RadioButton)findViewById(R.id.radioButton367);
	
		
		r411 = (RadioButton)findViewById(R.id.radio411);
		r412 = (RadioButton)findViewById(R.id.radio412);
		r413 = (RadioButton)findViewById(R.id.radio413);
		r414 = (RadioButton)findViewById(R.id.radioButton414);
		r415 = (RadioButton)findViewById(R.id.radioButton415);
		r416 = (RadioButton)findViewById(R.id.radioButton416);
		r417 = (RadioButton)findViewById(R.id.radioButton417);

		r421 = (RadioButton)findViewById(R.id.radio421);
		r422 = (RadioButton)findViewById(R.id.radio422);
		r423 = (RadioButton)findViewById(R.id.radio423);
		r424 = (RadioButton)findViewById(R.id.radioButton424);
		r425 = (RadioButton)findViewById(R.id.radioButton425);
		r426 = (RadioButton)findViewById(R.id.radioButton426);
		r427 = (RadioButton)findViewById(R.id.radioButton427);

		r431 = (RadioButton)findViewById(R.id.radio431);
		r432 = (RadioButton)findViewById(R.id.radio432);
		r433 = (RadioButton)findViewById(R.id.radio433);
		r434 = (RadioButton)findViewById(R.id.radioButton434);
		r435 = (RadioButton)findViewById(R.id.radioButton435);
		r436 = (RadioButton)findViewById(R.id.radioButton436);
		r437 = (RadioButton)findViewById(R.id.radioButton437);

		r441 = (RadioButton)findViewById(R.id.radio441);
		r442 = (RadioButton)findViewById(R.id.radio442);
		r443 = (RadioButton)findViewById(R.id.radio443);
		r444 = (RadioButton)findViewById(R.id.radioButton444);
		r445 = (RadioButton)findViewById(R.id.radioButton445);
		r446 = (RadioButton)findViewById(R.id.radioButton446);
		r447 = (RadioButton)findViewById(R.id.radioButton447);

		r451 = (RadioButton)findViewById(R.id.radio451);
		r452 = (RadioButton)findViewById(R.id.radio452);
		r453 = (RadioButton)findViewById(R.id.radio453);
		r454 = (RadioButton)findViewById(R.id.radioButton454);
		r455 = (RadioButton)findViewById(R.id.radioButton455);
		r456 = (RadioButton)findViewById(R.id.radioButton456);
		r457 = (RadioButton)findViewById(R.id.radioButton457);

		r461 = (RadioButton)findViewById(R.id.radio461);
		r462 = (RadioButton)findViewById(R.id.radio462);
		r463 = (RadioButton)findViewById(R.id.radio463);
		r464 = (RadioButton)findViewById(R.id.radioButton464);
		r465 = (RadioButton)findViewById(R.id.radioButton465);
		r466 = (RadioButton)findViewById(R.id.radioButton466);
		r467 = (RadioButton)findViewById(R.id.radioButton467);

		
		r511 = (RadioButton)findViewById(R.id.radio511);
		r512 = (RadioButton)findViewById(R.id.radio512);
		r513 = (RadioButton)findViewById(R.id.radio513);
		r514 = (RadioButton)findViewById(R.id.radioButton514);
		r515 = (RadioButton)findViewById(R.id.radioButton515);
		r516 = (RadioButton)findViewById(R.id.radioButton516);
		r517 = (RadioButton)findViewById(R.id.radioButton517);

		r521 = (RadioButton)findViewById(R.id.radio521);
		r522 = (RadioButton)findViewById(R.id.radio522);
		r523 = (RadioButton)findViewById(R.id.radio523);
		r524 = (RadioButton)findViewById(R.id.radioButton524);
		r525 = (RadioButton)findViewById(R.id.radioButton525);
		r526 = (RadioButton)findViewById(R.id.radioButton526);
		r527 = (RadioButton)findViewById(R.id.radioButton527);
	
		r531 = (RadioButton)findViewById(R.id.radio531);
		r532 = (RadioButton)findViewById(R.id.radio532);
		r533 = (RadioButton)findViewById(R.id.radio533);
		r534 = (RadioButton)findViewById(R.id.radioButton534);
		r535 = (RadioButton)findViewById(R.id.radioButton535);
		r536 = (RadioButton)findViewById(R.id.radioButton536);
		r537 = (RadioButton)findViewById(R.id.radioButton537);
	
		r541 = (RadioButton)findViewById(R.id.radio541);
		r542 = (RadioButton)findViewById(R.id.radio542);
		r543 = (RadioButton)findViewById(R.id.radio543);
		r544 = (RadioButton)findViewById(R.id.radioButton544);
		r545 = (RadioButton)findViewById(R.id.radioButton545);
		r546 = (RadioButton)findViewById(R.id.radioButton546);
		r547 = (RadioButton)findViewById(R.id.radioButton547);

		r551 = (RadioButton)findViewById(R.id.radio551);
		r552 = (RadioButton)findViewById(R.id.radio552);
		r553 = (RadioButton)findViewById(R.id.radio553);
		r554 = (RadioButton)findViewById(R.id.radioButton554);
		r555 = (RadioButton)findViewById(R.id.radioButton555);
		r556 = (RadioButton)findViewById(R.id.radioButton556);
		r557 = (RadioButton)findViewById(R.id.radioButton557);

		r561 = (RadioButton)findViewById(R.id.radio561);
		r562 = (RadioButton)findViewById(R.id.radio562);
		r563 = (RadioButton)findViewById(R.id.radio563);
		r564 = (RadioButton)findViewById(R.id.radioButton564);
		r565 = (RadioButton)findViewById(R.id.radioButton565);
		r566 = (RadioButton)findViewById(R.id.radioButton566);
		r567 = (RadioButton)findViewById(R.id.radioButton567);

		
		
		
		
		jixu.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				double a1 = 0;
				double a2 = 0;
				double a3 = 0;
				double a4 = 0;
				double a5 = 0;
				double a6 = 0;
				double b11 = 0;
				double b12 = 0;
				double b13 = 0;
				double b14 = 0;
				double b15 = 0;
				double b16 = 0;
				double b21 = 0;
				double b22 = 0;
				double b23 = 0;
				double b24 = 0;
				double b25 = 0;
				double b26 = 0;
				double b31 = 0;
				double b32 = 0;
				double b33 = 0;
				double b34 = 0;
				double b35 = 0;
				double b36 = 0;
				double b41 = 0;
				double b42 = 0;
				double b43 = 0;
				double b44 = 0;
				double b45 = 0;
				double b46 = 0;
						
			    //  收集a1
				if(r11.isChecked()){
					a1=7;
				}else if(r12.isChecked()){
					a1=5;
				}else if(r13.isChecked()){
					a1=3;
				}else if(r14.isChecked()){
					a1=1;
				}else if(r15.isChecked()){
					a1=0.333333;
				}else if(r16.isChecked()){
					a1=0.2;
				}else if(r17.isChecked()){
					a1=0.142857;
				}
				//	收集a2
				if(r21.isChecked()){
					a2=7;
				}else if(r22.isChecked()){
					a2=5;
				}else if(r23.isChecked()){
					a2=3;
				}else if(r24.isChecked()){
					a2=1;
				}else if(r25.isChecked()){
					a2=0.333333;
				}else if(r26.isChecked()){
					a2=0.2;
				}else if(r27.isChecked()){
					a2=0.142857;
				}
				//  收集a3
				if(r31.isChecked()){
					a3=7;
				}else if(r32.isChecked()){
					a3=5;
				}else if(r33.isChecked()){
					a3=3;
				}else if(r34.isChecked()){
					a3=1;
				}else if(r35.isChecked()){
					a3=0.333333;
				}else if(r36.isChecked()){
					a3=0.2;
				}else if(r37.isChecked()){
					a3=0.142857;
				}
			    //  收集a4
				if(r41.isChecked()){
					a4=7;
				}else if(r42.isChecked()){
					a4=5;
				}else if(r43.isChecked()){
					a4=3;
				}else if(r44.isChecked()){
					a4=1;
				}else if(r45.isChecked()){
					a4=0.333333;
				}else if(r46.isChecked()){
					a4=0.2;
				}else if(r47.isChecked()){
					a4=0.142857;
				}
			    //  收集a5
				if(r51.isChecked()){
					a5=7;
				}else if(r52.isChecked()){
					a5=5;
				}else if(r53.isChecked()){
					a5=3;
				}else if(r54.isChecked()){
					a5=1;
				}else if(r55.isChecked()){
					a5=0.333333;
				}else if(r56.isChecked()){
					a5=0.2;
				}else if(r57.isChecked()){
					a5=0.142857;
				}
			    //  收集a6
				if(r61.isChecked()){
					a6=7;
				}else if(r62.isChecked()){
					a6=5;
				}else if(r63.isChecked()){
					a6=3;
				}else if(r64.isChecked()){
					a6=1;
				}else if(r65.isChecked()){
					a6=0.333333;
				}else if(r66.isChecked()){
					a6=0.2;
				}else if(r67.isChecked()){
					a6=0.142857;
				}
				//  收集b11
				if(r211.isChecked()){
					b11=7;
				}else if(r212.isChecked()){
					b11=5;
				}else if(r213.isChecked()){
					b11=3;
				}else if(r214.isChecked()){
					b11=1;
				}else if(r215.isChecked()){
					b11=0.333333;
				}else if(r216.isChecked()){
					b11=0.2;
				}else if(r217.isChecked()){
					b11=0.142857;
				}	
				//  收集b12
				if(r221.isChecked()){
					b12=7;
				}else if(r222.isChecked()){
					b12=5;
				}else if(r223.isChecked()){
					b12=3;
				}else if(r224.isChecked()){
					b12=1;
				}else if(r225.isChecked()){
					b12=0.333333;
				}else if(r226.isChecked()){
					b12=0.2;
				}else if(r227.isChecked()){
					b12=0.142857;
				}	
				//  收集b13
				if(r231.isChecked()){
					b13=7;
				}else if(r232.isChecked()){
					b13=5;
				}else if(r233.isChecked()){
					b13=3;
				}else if(r234.isChecked()){
					b13=1;
				}else if(r235.isChecked()){
					b13=0.333333;
				}else if(r236.isChecked()){
					b13=0.2;
				}else if(r237.isChecked()){
					b13=0.142857;
				}
				//  收集b14
				if(r241.isChecked()){
					b14=7;
				}else if(r242.isChecked()){
					b14=5;
				}else if(r243.isChecked()){
					b14=3;
				}else if(r244.isChecked()){
					b14=1;
				}else if(r245.isChecked()){
					b14=0.333333;
				}else if(r246.isChecked()){
					b14=0.2;
				}else if(r247.isChecked()){
					b14=0.142857;
				}
				//  收集b15
				if(r251.isChecked()){
					b15=7;
				}else if(r252.isChecked()){
					b15=5;
				}else if(r253.isChecked()){
					b15=3;
				}else if(r254.isChecked()){
					b15=1;
				}else if(r255.isChecked()){
					b15=0.333333;
				}else if(r256.isChecked()){
					b15=0.2;
				}else if(r257.isChecked()){
					b15=0.142857;
				}
				//  收集b16
				if(r261.isChecked()){
					b16=7;
				}else if(r262.isChecked()){
					b16=5;
				}else if(r263.isChecked()){
					b16=3;
				}else if(r264.isChecked()){
					b16=1;
				}else if(r265.isChecked()){
					b16=0.333333;
				}else if(r266.isChecked()){
					b16=0.2;
				}else if(r267.isChecked()){
					b16=0.142857;
				}
				
				//  收集b21
				if(r311.isChecked()){
					b21=7;
				}else if(r312.isChecked()){
					b21=5;
				}else if(r313.isChecked()){
					b21=3;
				}else if(r314.isChecked()){
					b21=1;
				}else if(r315.isChecked()){
					b21=0.333333;
				}else if(r316.isChecked()){
					b21=0.2;
				}else if(r317.isChecked()){
					b21=0.142857;
				}	
				//  收集b22
				if(r321.isChecked()){
					b22=7;
				}else if(r322.isChecked()){
					b22=5;
				}else if(r323.isChecked()){
					b22=3;
				}else if(r324.isChecked()){
					b22=1;
				}else if(r325.isChecked()){
					b22=0.333333;
				}else if(r326.isChecked()){
					b22=0.2;
				}else if(r327.isChecked()){
					b22=0.142857;
				}	
				//  收集b23
				if(r331.isChecked()){
					b23=7;
				}else if(r332.isChecked()){
					b23=5;
				}else if(r333.isChecked()){
					b23=3;
				}else if(r334.isChecked()){
					b23=1;
				}else if(r335.isChecked()){
					b23=0.333333;
				}else if(r336.isChecked()){
					b23=0.2;
				}else if(r337.isChecked()){
					b23=0.142857;
				}
				//  收集b24
				if(r341.isChecked()){
					b24=7;
				}else if(r342.isChecked()){
					b24=5;
				}else if(r343.isChecked()){
					b24=3;
				}else if(r344.isChecked()){
					b24=1;
				}else if(r345.isChecked()){
					b24=0.333333;
				}else if(r346.isChecked()){
					b24=0.2;
				}else if(r347.isChecked()){
					b24=0.142857;
				}
				//  收集b25
				if(r351.isChecked()){
					b25=7;
				}else if(r352.isChecked()){
					b25=5;
				}else if(r353.isChecked()){
					b25=3;
				}else if(r354.isChecked()){
					b25=1;
				}else if(r355.isChecked()){
					b25=0.333333;
				}else if(r356.isChecked()){
					b25=0.2;
				}else if(r357.isChecked()){
					b25=0.142857;
				}
				//  收集b26
				if(r361.isChecked()){
					b26=7;
				}else if(r362.isChecked()){
					b26=5;
				}else if(r363.isChecked()){
					b26=3;
				}else if(r364.isChecked()){
					b26=1;
				}else if(r365.isChecked()){
					b26=0.333333;
				}else if(r366.isChecked()){
					b26=0.2;
				}else if(r367.isChecked()){
					b26=0.142857;
				}
				
				//  收集b31
				if(r411.isChecked()){
					b31=7;
				}else if(r412.isChecked()){
					b31=5;
				}else if(r413.isChecked()){
					b31=3;
				}else if(r414.isChecked()){
					b31=1;
				}else if(r415.isChecked()){
					b31=0.333333;
				}else if(r416.isChecked()){
					b31=0.2;
				}else if(r417.isChecked()){
					b31=0.142857;
				}	
				//  收集b32
				if(r421.isChecked()){
					b32=7;
				}else if(r422.isChecked()){
					b32=5;
				}else if(r423.isChecked()){
					b32=3;
				}else if(r424.isChecked()){
					b32=1;
				}else if(r425.isChecked()){
					b32=0.333333;
				}else if(r426.isChecked()){
					b32=0.2;
				}else if(r427.isChecked()){
					b32=0.142857;
				}	
				//  收集b33
				if(r431.isChecked()){
					b33=7;
				}else if(r432.isChecked()){
					b33=5;
				}else if(r433.isChecked()){
					b33=3;
				}else if(r434.isChecked()){
					b33=1;
				}else if(r435.isChecked()){
					b33=0.333333;
				}else if(r436.isChecked()){
					b33=0.2;
				}else if(r437.isChecked()){
					b33=0.142857;
				}
				//  收集b34
				if(r441.isChecked()){
					b34=7;
				}else if(r442.isChecked()){
					b34=5;
				}else if(r443.isChecked()){
					b34=3;
				}else if(r444.isChecked()){
					b34=1;
				}else if(r445.isChecked()){
					b34=0.333333;
				}else if(r446.isChecked()){
					b34=0.2;
				}else if(r447.isChecked()){
					b34=0.142857;
				}
				//  收集b35
				if(r451.isChecked()){
					b35=7;
				}else if(r452.isChecked()){
					b35=5;
				}else if(r453.isChecked()){
					b35=3;
				}else if(r454.isChecked()){
					b35=1;
				}else if(r455.isChecked()){
					b35=0.333333;
				}else if(r456.isChecked()){
					b35=0.2;
				}else if(r457.isChecked()){
					b35=0.142857;
				}
				//  收集b36
				if(r461.isChecked()){
					b36=7;
				}else if(r462.isChecked()){
					b36=5;
				}else if(r463.isChecked()){
					b36=3;
				}else if(r464.isChecked()){
					b36=1;
				}else if(r465.isChecked()){
					b36=0.333333;
				}else if(r466.isChecked()){
					b36=0.2;
				}else if(r467.isChecked()){
					b36=0.142857;
				}
				
				//  收集b41
				if(r511.isChecked()){
					b41=7;
				}else if(r512.isChecked()){
					b41=5;
				}else if(r513.isChecked()){
					b41=3;
				}else if(r514.isChecked()){
					b41=1;
				}else if(r515.isChecked()){
					b41=0.333333;
				}else if(r516.isChecked()){
					b41=0.2;
				}else if(r517.isChecked()){
					b41=0.142857;
				}	
				//  收集b22
				if(r521.isChecked()){
					b42=7;
				}else if(r522.isChecked()){
					b42=5;
				}else if(r523.isChecked()){
					b42=3;
				}else if(r524.isChecked()){
					b42=1;
				}else if(r525.isChecked()){
					b42=0.333333;
				}else if(r526.isChecked()){
					b42=0.2;
				}else if(r527.isChecked()){
					b42=0.142857;
				}	
				//  收集b23
				if(r531.isChecked()){
					b43=7;
				}else if(r532.isChecked()){
					b43=5;
				}else if(r533.isChecked()){
					b43=3;
				}else if(r534.isChecked()){
					b43=1;
				}else if(r535.isChecked()){
					b43=0.333333;
				}else if(r536.isChecked()){
					b43=0.2;
				}else if(r537.isChecked()){
					b43=0.142857;
				}
				//  收集b24
				if(r541.isChecked()){
					b44=7;
				}else if(r542.isChecked()){
					b44=5;
				}else if(r543.isChecked()){
					b44=3;
				}else if(r544.isChecked()){
					b44=1;
				}else if(r545.isChecked()){
					b44=0.333333;
				}else if(r546.isChecked()){
					b44=0.2;
				}else if(r547.isChecked()){
					b44=0.142857;
				}
				//  收集b25
				if(r551.isChecked()){
					b45=7;
				}else if(r552.isChecked()){
					b45=5;
				}else if(r553.isChecked()){
					b45=3;
				}else if(r554.isChecked()){
					b45=1;
				}else if(r555.isChecked()){
					b45=0.333333;
				}else if(r556.isChecked()){
					b45=0.2;
				}else if(r557.isChecked()){
					b45=0.142857;
				}
				//  收集b26
				if(r561.isChecked()){
					b46=7;
				}else if(r562.isChecked()){
					b46=5;
				}else if(r563.isChecked()){
					b46=3;
				}else if(r564.isChecked()){
					b46=1;
				}else if(r565.isChecked()){
					b46=0.333333;
				}else if(r566.isChecked()){
					b46=0.2;
				}else if(r567.isChecked()){
					b46=0.142857;
				}
				
				double s1=1+1/a1+1/a2+1/a3;
				double s2=a1+1+1/a4+1/a5;
				double s3=a2+a4+1+1/a6;
				double s4=a3+a5+a6+1;
				
				double v1=(1/s1+a1/s2+a2/s3+a3/s4)/4;
				double v2=(1/a1/s1+1/s2+a4/s3+a5/s4)/4;
				double v3=(1/a2/s1+1/a4/s2+1/s3+a6/s4)/4;
				double v4=(1/a3/s1+1/a5/s2+1/a6/s3+1/s4)/4;
				
				double c1=(1*v1+a1*v2+a2*v3+a3*v4)/v1;
				double c2=(v1*1/a1+v2*1+v3*a3+v4*a5)/v2;
				double c3=(v1*1/a2+v2*1/a4+v3*1+v4*a6)/v3;
				double c4=(v1*1/a3+v2*1/a5+v3*1/a6+v4*1)/v4;
				double c=(c1+c2+c3+c4)/4;//c判断是否一致
				
				double s11=1+1/b11+1/b12+1/b13;
				double s12=b11+1+1/b14+1/b15;
				double s13=b12+b14+1+1/b16;
				double s14=b13+b15+b16+1;
				
				double v11=(1/s11+b11/s12+b12/s13+b13/s14)/4;
				double v12=(1/b11/s11+1/s12+b14/s13+b15/s14)/4;
				double v13=(1/b12/s11+1/b14/s12+1/s13+b16/s14)/4;
				double v14=(1/b13/s11+1/b15/s12+1/b16/s13+1/s14)/4;
				
				double s21=1+1/b21+1/b22+1/b23;
				double s22=b21+1+1/b24+1/b25;
				double s23=b22+b24+1+1/b26;
				double s24=b23+b25+b26+1;
				
				double v21=(1/s21+b21/s22+b22/s23+b23/s24)/4;
				double v22=(1/b21/s21+1/s22+b24/s23+b25/s24)/4;
				double v23=(1/b22/s21+1/b24/s22+1/s23+b26/s24)/4;
				double v24=(1/b23/s21+1/b25/s22+1/b26/s23+1/s24)/4;
				
				double s31=1+1/b31+1/b32+1/b33;
				double s32=b31+1+1/b34+1/b35;
				double s33=b32+b34+1+1/b36;
				double s34=b33+b35+b36+1;
				
				double v31=(1/s31+b31/s32+b32/s33+b33/s34)/4;
				double v32=(1/b31/s31+1/s32+b34/s33+b35/s34)/4;
				double v33=(1/b32/s31+1/b34/s32+1/s33+b36/s34)/4;
				double v34=(1/b33/s31+1/b35/s32+1/b36/s33+1/s34)/4;
				
				double s41=1+1/b41+1/b42+1/b43;
				double s42=b41+1+1/b44+1/b45;
				double s43=b42+b44+1+1/b46;
				double s44=b43+b45+b46+1;
				
				double v41=(1/s41+b41/s42+b42/s43+b43/s44)/4;
				double v42=(1/b41/s41+1/s42+b44/s43+b45/s44)/4;
				double v43=(1/b42/s41+1/b44/s42+1/s43+b46/s44)/4;
				double v44=(1/b43/s41+1/b45/s42+1/b46/s43+1/s44)/4;
				
				t7.setText(v1+"");
				t8.setText(v2+"");
				t9.setText(v3+"");
				t10.setText(v4+"");
				
				t12.setText(v11+"");
				t13.setText(v12+"");
				t14.setText(v13+"");
				t15.setText(v14+"");
				
				t17.setText(v21+"");
				t18.setText(v22+"");
				t19.setText(v23+"");
				t20.setText(v24+"");
				
				t22.setText(v31+"");
				t23.setText(v32+"");
				t24.setText(v33+"");
				t25.setText(v34+"");
				
				t27.setText(v41+"");
				t28.setText(v42+"");
				t29.setText(v43+"");
				t30.setText(v44+"");
				
				double plan1=b11*v1+b21*v2+b31*v3+b41*v4;
				double plan2=b12*v1+b22*v2+b32*v3+b42*v4;
				double plan3=b13*v1+b23*v2+b33*v3+b43*v4;
				double plan4=b14*v1+b24*v2+b34*v3+b44*v4;
				if(plan1>plan2&&plan1>plan3&&plan1>plan4){
					t31.setText("iPad Pro3是最适当的选择");
				}else if(plan2>plan1&&plan2>plan3&&plan2>plan4){
					t31.setText("iPad Air3是最适当的选择");
				}else if(plan3>plan1&&plan3>plan2&&plan3>plan4){
					t31.setText("iPad mini5是最适当的选择");
				}else if(plan4>plan1&&plan4>plan2&&plan4>plan3){
					t31.setText("iPad 2019是最适当的选择");
				}else if(plan1==plan2){
					t31.setText("iPad Pro3、iPad Air3是最适当的选择");
				}else if(plan1==plan3){
					t31.setText("iPad Pro3、iPad mini5是最适当的选择");
				}else if(plan1==plan4){
					t31.setText("iPad Pro3、iPad 2019是最适当的选择");
				}else if(plan2==plan3){
					t31.setText("iPad Air3、iPad mini5是最适当的选择");
				}	
				else if(plan2==plan4){
					t31.setText("iPad Air3、iPad 2019是最适当的选择");
				}else if(plan3==plan4){
					t31.setText("iPad mini5、iPad 2019是最适当的选择");
				}else if(plan1==plan2&&plan2==plan3){
					t31.setText("iPad Pro3、iPad Air3、iPad mini5都是最适当的选择");
				}else if(plan1==plan2&&plan2==plan4){
					t31.setText("iPad Pro3、iPad Air3、iPad 2019都是最适当的选择");
				}else if(plan1==plan3&&plan3==plan4){
					t31.setText("iPad Pro3、iPad mini5、iPad mini5都是最适当的选择");
				}else if(plan2==plan3&&plan3==plan4){
					t31.setText("iPad Air3、iPad mini5、iPad mini5都是最适当的选择");
				}
				
				
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.a1, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
