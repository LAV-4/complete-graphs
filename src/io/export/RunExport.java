package io.export;

import io.safeLoad.SafeLoad;

/**
 * Class to export the contents of a folder to .gml files.
 * @author Tommy
 *
 */
public class RunExport {

	public static void main(String[] args) {
		if (args.length != 1) {
			throw new IllegalArgumentException("Usage: io.export.RunExport <embedding-folder>");
		}

		System.out.println("Exporting files ...");
		if (!SafeLoad.exportAll(args[0])) {
			throw new IllegalStateException("Could not export embeddings from " + args[0]);
		}
		System.out.println("DONE.");
	}

}
