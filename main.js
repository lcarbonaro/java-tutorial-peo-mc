import 'reveal.js/dist/reset.css';
import 'reveal.js/dist/reveal.css';
import 'reveal.js/dist/theme/black.css';
import 'reveal.js/plugin/highlight/monokai.css';

import Reveal from 'reveal.js';
import Markdown from 'reveal.js/plugin/markdown/markdown.esm.js';

import Highlight from 'reveal.js/plugin/highlight/highlight.esm';
import Zoom from 'reveal.js/plugin/zoom/zoom.esm';
import Notes from 'reveal.js/plugin/notes/notes.esm';
import Search from 'reveal.js/plugin/search/search.esm';

/*
<script src="plugin/zoom/zoom.js"></script>
	<script src="plugin/notes/notes.js"></script>
	<script src="plugin/search/search.js"></script>
*/

let deck = new Reveal({
   plugins: [ Markdown,Highlight,Zoom,Notes,Search ],
   slideNumber: 'c/t'
})
deck.initialize();