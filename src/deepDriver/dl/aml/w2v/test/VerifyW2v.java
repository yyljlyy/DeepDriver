package deepDriver.dl.aml.w2v.test;

import java.util.List;

import deepDriver.dl.aml.distribution.Fs;
import deepDriver.dl.aml.w2v.KeyCntPair;
import deepDriver.dl.aml.w2v.W2V;

public class VerifyW2v {
	
	public static void main(String[] args) throws Exception {
//		String froot = "D:\\6.workspace\\ANN\\lstm\\";
		String froot = "D:\\workspace\\DeepDriver\\data\\";
		W2V w2v = (W2V) Fs.readObjFromFile(froot +
				"w2v_1475474195512_0.m");//w2v_1475139503607_0.m
		System.out.println("Done for loading...");
		String k = "狗血";
		List<KeyCntPair> list = w2v.getSimilarity(k, 100);
		System.out.println("Similarity with "+k+" is: ");
		for (int i = 0; i < 10; i++) {
			KeyCntPair kcp = list.get(i);
			System.out.println(kcp.getKey()+","+kcp.getValue());
		}
	}

}
