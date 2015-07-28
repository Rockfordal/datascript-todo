if(typeof goog == "undefined") document.write('<script src="target/none/goog/base.js"></script>');
document.write('<script src="target/none/cljs_deps.js"></script>');

document.write("<script>if (typeof goog != \"undefined\") { goog.require(\"figwheel.connect\"); }</script>");
document.write('<script>if (typeof goog != "undefined") { goog.require("datascript_todo"); } else { console.warn("ClojureScript could not load :main, did you forget to specify :asset-path?"); };</script>');