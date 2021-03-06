# Reactant

A audio visual performance interface experiment using Quil.

## Usage

I hope you like the terminal.

1. Install [Leiningen](http://leiningen.org/). See the installation
   instructions on the Leiningen homepage.
2. Navigate to this directory in the terminal. `cd /path/to/this/dir/`
3. Run Leiningen's Read Eval Print Loop. `lein repl`
4. Load Reactant. `(use 'reactant.core)`
5. Play.

You can [reload namespaces][dynamic] to modify the application while running.
i.e. `(use :reload 'reactant.dynamic)`

[dynamic]: https://github.com/quil/quil/wiki/Dynamic-Workflow-(for-REPL)

### Editor integration

#### Emacs

Maybe you like emacs.

1. Install Leiningen as above.
2. Configure Leiningen if you haven't done so yet:
   1. Make sure your `~/.lein/profile.clj` has at least:
	   `{:user {:plugins [[cider/cider-nrepl "x.y.z"]]}}`[^1]
   2. Navigate to this directory in the terminal. `cd /path/to/this/dir/`
   3. Ask Leiningen to install the dependencies. `lein deps`
3. Configure emacs if you haven't done so yet:
   1. Start emacs
   2. Install clojure-mode. `M-x package-install RET clojure-mode`
   3. Install cider. `M-x package install RET cider`
   4. Add to your emacs config: `(require 'clojure-mode-autoloads)`
   5. Restart emacs (or eval the require above)

Now the fun bit.

1. Open in emacs Reactant's `core.clj`
2. Ask cider to start the Leiningen Repl server and connect to it:
   `M-x cider-jack-in`
3. Wait a bit until you see an inspirational quote.
4. Hit `C-c C-c`... wow!
5. Open Reactant's `dynamic.clj`
6. Change something in `update` or `draw`, hit `C-c C-c` ... wow!
7. Play.

[^1]: currently "x.y.z" is "0.8.2-SNAPSHOT"

#### Vim

Maybe you like vim.

1. Install Leiningen as above.
2. Add the [CIDER nREPL](https://github.com/clojure-emacs/cider-nrepl) plugin
   to your `~/.lein/profile.clj`.
3. Install [tpope's fireplace](https://github.com/tpope/vim-fireplace) vim
   plugin. If you don't have a favourite package manager, I recommend
   [gmarik's Vundle](https://github.com/gmarik/Vundle.vim).
4. Open the project directory in two terminals.
5. Install the leiningen dependencies. `lein deps`
6. Run Leiningen's Read Eval Print Loop. `lein repl`

Now the fun bit.

1. Open vim in the other terminal.
2. Open `src/reactant/core.clj`.
3. Run `:Require`... Magic!
4. Open `src/reactant/dynamic.clj`
5. Change something in `draw`, run `:Require`... Cool, huh?
6. Play.

I recommend mapping `:Require` to something. I like `<leader>r`.

#### Sublime Text

Maybe you like Sublime Text

1. Consider installing Emacs
2. Consider installing Vim
